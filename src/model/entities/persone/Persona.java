package model.entities.persone;

public class Persona
{
	protected String nome,cognome,codiceFiscale;

	public Persona(){}
	public Persona(String nome,String cognome, String codiceFiscale)
	{
		this.nome = nome;
		this.codiceFiscale = codiceFiscale;
		this.cognome = cognome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCodiceFiscale()
	{
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale)
	{
		this.codiceFiscale = codiceFiscale;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
}
