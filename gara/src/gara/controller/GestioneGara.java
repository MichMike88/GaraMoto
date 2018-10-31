package gara.controller;

import java.sql.SQLException;

import gara.dao.PilotaDao;

public class GestioneGara {

	PilotaDao pdao= new PilotaDao();
	
	public PilotaDao inserisciPilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
		
		pdao.cercapilota(nome, cognome, codicefiscale);
		
		return pdao;
	}
	
	public PilotaDao cercaPilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
		
		pdao.cercapilota(nome, cognome);
		
		return pdao;
	}
}
