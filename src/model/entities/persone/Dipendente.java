package model.entities.persone;


public class Dipendente extends Persona
{
	protected String ruolo;
	protected int ral;

	public Dipendente(){}
	public Dipendente(String nome, String cognome, String codiceFiscale, String ruolo, int ral)
	{
		super(nome, cognome, codiceFiscale);
		this.ruolo = ruolo;
		this.ral = ral;
	}

	public String getRuolo()
	{
		return ruolo;
	}

	public void setRuolo(String ruolo)
	{
		this.ruolo = ruolo;
	}

	public int getRal()
	{
		return ral;
	}

	public void setRal(int ral)
	{
		this.ral = ral;
	}
}
