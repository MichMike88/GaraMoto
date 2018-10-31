package gara.controller;



import gara.dao.PilotaDao;

public class GestioneGara {

	PilotaDao pdao= new PilotaDao();
	
	public PilotaDao inserisciPilota(String nome,String cognome,String codicefiscale) throws ClassNotFoundException, SQLException {
		
		pdao.cercapilota(nome, cognome, codicefiscale);
		
		return pdao;
	}
	
	public PilotaDao cercaPilota(String nome,String cognome) throws ClassNotFoundException, SQLException {
		
		pdao.cercapilota(nome, cognome,codicefiscale);
		
		return pdao;
	}
}
