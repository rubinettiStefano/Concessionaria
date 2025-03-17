package model.entities.veicoli.auto;

public class Berlina extends  Automobile
{
	protected int dimensioneBagagliaio,numeroPorte;

	public Berlina(){
	}

	public Berlina(String accessori, String targa, int velMax, int cilindrata, int cavalli, String accessori1, int cilindrata1, int dimensioneBagagliaio, int numeroPorte)
	{
		super(accessori, targa, velMax, cilindrata, cavalli, accessori1, cilindrata1);
		this.dimensioneBagagliaio = dimensioneBagagliaio;
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte()
	{
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte)
	{
		this.numeroPorte = numeroPorte;
	}

	public int getDimensioneBagagliaio()
	{
		return dimensioneBagagliaio;
	}

	public void setDimensioneBagagliaio(int dimensioneBagagliaio)
	{
		this.dimensioneBagagliaio = dimensioneBagagliaio;
	}
}
