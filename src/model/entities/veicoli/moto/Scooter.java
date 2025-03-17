package model.entities.veicoli.moto;

public class Scooter extends Moto
{
	protected boolean abitacolo,bagagliaio;


	public Scooter(){

	}

	public Scooter(String targa, int velMax, int cavalli, int peso, int numeroMarce, boolean abitacolo, boolean bagagliaio)
	{
		super(targa, velMax, cavalli, peso, numeroMarce);
		this.abitacolo = abitacolo;
		this.bagagliaio = bagagliaio;
	}

	public boolean isAbitacolo()
	{
		return abitacolo;
	}

	public void setAbitacolo(boolean abitacolo)
	{
		this.abitacolo = abitacolo;
	}

	public boolean isBagagliaio()
	{
		return bagagliaio;
	}

	public void setBagagliaio(boolean bagagliaio)
	{
		this.bagagliaio = bagagliaio;
	}
}
