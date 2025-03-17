package model.entities.veicoli;

import exceptions.SetterException;

public class Veicolo
{
	protected int velMax,cavalli;
	protected String targa;
	
	public Veicolo(){}
	public Veicolo( String targa, int velMax, int cavalli)
	{
		setTarga(targa);
		setVelMax(velMax);
		setCavalli(cavalli);
	}



	public String getTarga()
	{
		return targa;
	}

	public void setTarga(String targa)
	{
		//se la stringa non è tutta in maiuscolo do eccezione
		if(!targa.equals(targa.toUpperCase()))
			throw new SetterException("NON IN MAIUSCOLO","targa");

		//controllo se ha 7 caratteri
		if(targa.length()!=7)
			throw new SetterException("lunghezza sbagliata","targa");

		char[] t = targa.toCharArray();
		//controllo di avere 2 lettere,3 numeri,2 lettere
		if(
				!Character.isAlphabetic(t[0]) 	||
				!Character.isAlphabetic(t[1]) 	||
				!Character.isDigit(t[2]) 		||
				!Character.isDigit(t[3]) 		||
				!Character.isDigit(t[4]) 		||
				!Character.isAlphabetic(t[5]) 	||
				!Character.isAlphabetic(t[6])
		)
			throw new SetterException("formato sbagliata","targa");

		this.targa = targa;
	}

	public int getVelMax()
	{
		return velMax;
	}

	public void setVelMax(int velMax)
	{
		if(velMax<=0||velMax>500)
			throw new SetterException("fuori range","velmax");

		this.velMax=velMax;
	}

	public int getCavalli()
	{
		return cavalli;
	}

	public void setCavalli(int cavalli)
	{
		if(cavalli<=0||cavalli>1000)
			throw new SetterException("fuori range","cavalli");
		this.cavalli = cavalli;
	}
}
