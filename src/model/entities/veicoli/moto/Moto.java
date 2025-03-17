package model.entities.veicoli.moto;

import model.entities.veicoli.Veicolo;

public class Moto extends Veicolo
{
	protected int peso,numeroMarce;

	public Moto(){

	}


	public Moto(String targa, int velMax, int cavalli, int peso, int numeroMarce)
	{
		super(targa, velMax, cavalli);
		this.peso = peso;
		this.numeroMarce = numeroMarce;
	}

	public int getPeso()
	{
		return peso;
	}

	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	public int getNumeroMarce()
	{
		return numeroMarce;
	}

	public void setNumeroMarce(int numeroMarce)
	{
		this.numeroMarce = numeroMarce;
	}
}
