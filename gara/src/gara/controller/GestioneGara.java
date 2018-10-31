package gara.controller;

import java.sql.SQLException;

import gara.dao.PilotaDao;
import gara.vo.PilotaVo;

public class GestioneGara {

	PilotaDao pdao= new PilotaDao();
	PilotaVo pv= new PilotaVo();
	
	public int inserisciPilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
		
		int esito; 
		
		esito = pdao.inserscipilota(nome, cognome);
		
		return esito;
	}
	
	public PilotaVo cercaPilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
		
		pv= pdao.cercapilota(nome, cognome);
		
		return pv;
	}
}
