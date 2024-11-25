package com.ib;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 

@Scope("prototype")
public class Adresse {
	private int numeroRue = 3; 
	private String libelle = "chemin des fontaites"; 
	private String codePostal = "06620"; 
	private String Ville ="Cannes"; 

	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	
	@Override
	public String toString() {
		return "Adresse [numeroRue=" + numeroRue + ", libelle=" + libelle + ", codePostal=" + codePostal + ", Ville="
				+ Ville + "]";
	}

}
