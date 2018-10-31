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

		PilotaVo pilota = new PilotaVo();

		String url = "jdbc:mysql://localhost:3306/moto?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager.getConnection(url, username, password);

		Statement smt=connect.createStatement();
		
		String query="SELECT nome,cognome from pilota where nome='"+nome+"' and cognome='"+cognome+"'";
	
		ResultSet rs=smt.executeQuery(query);
		
		while(rs.next()) {
			pilota.setNome(rs.getString("nome"));
			pilota.setCognome(rs.getString("cognome"));
		}
		
		return pilota;

	}

	public int inserscipilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
				
		Connection connect= null;
		
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/moto?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName(driver);

		connect = DriverManager.getConnection(url, username, password);

		Statement smt=connect.createStatement();
		
		String query="INSERT INTO pilota (`nome`, `cognome`) VALUES ('"+nome+"', '"+cognome+"')";
		
		int esito=smt.executeUpdate(query);
				
		return esito;
	}
}
