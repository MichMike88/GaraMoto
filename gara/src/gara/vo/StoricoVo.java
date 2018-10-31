package gara.vo;

public class StoricoVo {

	String data;
	String circuito;
	int posizione;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getPosizione() {
		return posizione;
	}
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	@Override
	public String toString() {
		return posizione+circuito;
	}
	
}
