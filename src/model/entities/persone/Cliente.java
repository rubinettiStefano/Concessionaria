package model.entities.persone;

public class Cliente extends Persona
{
	protected String iban;
	protected double sconto;

	public Cliente(){}
	public Cliente(String nome, String cognome, String codiceFiscale, String iban, double sconto)
	{
		super(nome, cognome, codiceFiscale);
		this.iban = iban;
		this.sconto = sconto;
	}

	public double getSconto()
	{
		return sconto;
	}

	public void setSconto(double sconto)
	{
		if(sconto<0||sconto>0.5)
			this.sconto = sconto;
	}

	public String getIban()
	{
		return iban;
	}

	public void setIban(String iban)
	{
		if (iban.length()==6)
			this.iban = iban;
	}
}
