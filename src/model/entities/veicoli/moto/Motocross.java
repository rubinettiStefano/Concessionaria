package model.entities.veicoli.moto;

public class Motocross extends Moto
{
	protected boolean ruoteTassellate;
	protected String tipoGancio;

	public Motocross() {

	}

	public Motocross(String targa, int velMax, int cavalli, int peso, int numeroMarce, boolean ruoteTassellate, String tipoGancio)
	{
		super(targa, velMax, cavalli, peso, numeroMarce);
		this.ruoteTassellate = ruoteTassellate;
		this.tipoGancio = tipoGancio;
	}

	public boolean isRuoteTassellate()
	{
		return ruoteTassellate;
	}

	public void setRuoteTassellate(boolean ruoteTassellate)
	{
		this.ruoteTassellate = ruoteTassellate;
	}

	public String getTipoGancio()
	{
		return tipoGancio;
	}

	public void setTipoGancio(String tipoGancio)
	{
		switch (tipoGancio)
		{
			case "OCCHIALE","UNCINO","MOSCHETTONE"-> this.tipoGancio=tipoGancio;
		}
	}
}
