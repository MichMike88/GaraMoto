package gara.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gara.vo.PilotaVo;

public class PilotaDao {

	public PilotaVo cercapilota(String nome, String cognome) throws ClassNotFoundException, SQLException {

		Connection connect = null;

		PilotaVo pilota = null;

		String url = "jdbc:mysql://localhost:3306/moto";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager.getConnection(url, username, password);

		Statement smt=connect.createStatement();
		
		String query="select 'moto'.'pilota' from moto where nome='"+nome+"' and cognome='"+cognome;
		
		ResultSet rs=smt.executeQuery(query);
		
		while(rs.next()) {
			pilota= new PilotaVo();
			
			pilota.setNome(rs.getString("nome"));
			pilota.setCognome(rs.getString("cognome"));
		}
		
		return pilota;

	}

	public int inserscipilota(String nome,String cognome,String moto) throws ClassNotFoundException, SQLException {
				
		Connection connect= null;
		
		String url = "jdbc:mysql://localhost:3306/moto";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager.getConnection(url, username, password);

		Statement smt=connect.createStatement();
		
		String query="INSERT INTO `moto`.`pilota` (`nome`, `cognome`, `moto`) VALUES (nome='"+nome+"', cognome='"+cognome+"', moto='"+moto+"')";
		
		int esito=smt.executeUpdate(query);
				
		return esito;
	}
}
