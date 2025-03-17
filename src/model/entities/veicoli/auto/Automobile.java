package model.entities.veicoli.auto;

import model.entities.veicoli.Veicolo;

public class Automobile extends Veicolo
{
	protected String accessori;
	protected int cilindrata;

	public Automobile(){}
	public Automobile(String accessori, String targa, int velMax, int cilindrata, int cavalli, String accessori1, int cilindrata1)
	{
		super( targa, velMax,  cavalli);
		this.accessori = accessori1;
		this.cilindrata = cilindrata1;
	}

	public String getAccessori()
	{
		return accessori;
	}

	public void setAccessori(String accessori)
	{
		this.accessori = accessori;
	}

	public int getCilindrata()
	{
		return cilindrata;
	}

	public void setCilindrata(int cilindrata)
	{
		this.cilindrata = cilindrata;
	}
}
