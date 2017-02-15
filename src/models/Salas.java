package models;
// Generated 03-feb-2017 13:59:15 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Salas generated by hbm2java
 */
public class Salas implements java.io.Serializable {

	private Integer idSala;
	private Cines cines;
	private Integer numSala;
	private Integer filas;
	private int columnas;
	private Set proyeccions = new HashSet(0);

	public Salas() {
	}

	public Salas(Cines cines, int columnas) {
		this.cines = cines;
		this.columnas = columnas;
	}

	public Salas(Cines cines, Integer numSala, Integer filas, int columnas, Set proyeccions) {
		this.cines = cines;
		this.numSala = numSala;
		this.filas = filas;
		this.columnas = columnas;
		this.proyeccions = proyeccions;
	}

	public Integer getIdSala() {
		return this.idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public Cines getCines() {
		return this.cines;
	}

	public void setCines(Cines cines) {
		this.cines = cines;
	}

	public Integer getNumSala() {
		return this.numSala;
	}

	public void setNumSala(Integer numSala) {
		this.numSala = numSala;
	}

	public Integer getFilas() {
		return this.filas;
	}

	public void setFilas(Integer filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return this.columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Set getProyeccions() {
		return this.proyeccions;
	}

	public void setProyeccions(Set proyeccions) {
		this.proyeccions = proyeccions;
	}

}