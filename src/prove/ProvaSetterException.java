package prove;

import exceptions.SetterException;
import model.entities.veicoli.Veicolo;

import java.util.Scanner;

public class ProvaSetterException
{
	public static void main(String[] args)
	{

		Veicolo v= new Veicolo("AA000VV",100,3005);

//		Scanner sc = new Scanner(System.in);
//		Veicolo v = new Veicolo();
//
//		System.out.println("Metti la targa, vuoto per saltare");
//		while(true)
//		{
//			try
//			{
//				v.setTarga(sc.nextLine());
//				break;
//			}catch (SetterException e)
//			{
//				System.out.println(e.getPropertyName()+" da reinserire poichè: "+e.getMessage());
//			}
//		}

	}
}
