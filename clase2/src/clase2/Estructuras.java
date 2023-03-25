package clase2;

import javax.swing.JOptionPane;

public class Estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("hola mundo");
		int var1=1;
		int var2=2;
		var1=1;
		var2=2;
		var2=3;
		
		if (var1>var2) {
		System.out.println("la variable var1 es mayor que var2");	
		}
		else if (var1==var2) {
			System.out.println("las variables son iguales");
		}
		else {
			System.out.println("la variable var 2 es mayor que var1");
		}
		
		int [] myArray = new int [22];
		
		for(int i=0; i < myArray.length; i++)
		{
			myArray[i]=i;
		}
		MostrarArray(myArray);
		
		String str="";
		do {
			str = JOptionPane.showInputDialog("ingrese un texto");
			System.out.println(str);
		
		}while(!str.toLowerCase().equals("fin"));
		*/
		if(args.length >0)
		{

			for(int i=0; i < args.length; i++)
			{
				System.out.println(args[i]);
			}
			
		}
		
		
	
}
	public static void MostrarArray(int []Arraym)
	{
		for(int i=0; i < Arraym.length; i++)
		{
		System.out.println(Arraym[i]);
		
		}
	}

}
