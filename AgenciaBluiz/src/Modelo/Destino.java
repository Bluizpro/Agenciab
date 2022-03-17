package Modelo;

public class Destino {
	private Integer id;
	private String Destino;
	private String  ida;
	private String Volta;
    private int quantPassagens;
     
    
    public Destino() {
    	
    }


	public Destino(String destino, String ida, String volta, int quantPassagens) {
		super();
		Destino = destino;
		this.ida = ida;
		Volta = volta;
		this.quantPassagens = quantPassagens;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDestino() {
		return Destino;
	}


	public void setDestino(String destino) {
		Destino = destino;
	}


	public String getIda() {
		return ida;
	}


	public void setIda(String ida) {
		this.ida = ida;
	}


	public String getVolta() {
		return Volta;
	}


	public void setVolta(String volta) {
		Volta = volta;
	}


	public int getQuantPassagens() {
		return quantPassagens;
	}


	public void setQuantPassagens(int quantPassagens) {
		this.quantPassagens = quantPassagens;
	}
	
}
