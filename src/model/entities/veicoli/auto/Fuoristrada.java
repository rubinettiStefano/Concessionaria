package model.entities.veicoli.auto;

public class Fuoristrada extends Automobile
{
	protected double pendioMax;
	protected int altezzaDaTerra;

	public Fuoristrada(){}

	public Fuoristrada(String accessori, String targa, int velMax, int cilindrata, int cavalli, String accessori1, int cilindrata1, int altezzaDaTerra, double pendioMax)
	{
		super(accessori, targa, velMax, cilindrata, cavalli, accessori1, cilindrata1);
		this.altezzaDaTerra = altezzaDaTerra;
		this.pendioMax = pendioMax;
	}

	public double getPendioMax()
	{
		return pendioMax;
	}

	public void setPendioMax(double pendioMax)
	{
		this.pendioMax = pendioMax;
	}

	public int getAltezzaDaTerra()
	{
		return altezzaDaTerra;
	}

	public void setAltezzaDaTerra(int altezzaDaTerra)
	{
		this.altezzaDaTerra = altezzaDaTerra;
	}
}
