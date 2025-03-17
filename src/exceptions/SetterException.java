package exceptions;

public class SetterException extends RuntimeException
{
	private String propertyName;

	public SetterException(String msg,String propertyName)
	{
		super(msg);//new RuntimeException("Messaggio di errore");
		this.propertyName = propertyName;
	}



	public String getPropertyName()
	{
		return propertyName;
	}

	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
}
