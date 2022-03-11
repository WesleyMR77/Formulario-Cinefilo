package edu.ifms.wmr.model;

import java.util.ArrayList;

public class Cinefilo extends Pessoa{
	
	private ArrayList<String> generosPreferidos = new ArrayList<>();
	private String generoPreferido;
	private String biografia;
	

	public ArrayList<String> getGenerosPreferidos() {
		return generosPreferidos;
	}
	public void setGenerosPreferidos(ArrayList<String> generosPreferidos) {
		this.generosPreferidos = generosPreferidos;
	}
	public String getGeneroPreferido() {
		return generoPreferido;
	}
	public void setGeneroPreferido(String generoPreferido) {
		this.generoPreferido = generoPreferido;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
	

}
