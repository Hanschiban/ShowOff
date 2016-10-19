public class Algorithms
{
	int[] y = {2,4,9,5,55,32,45};
	public static void main (String[] args)
	{
		System.out.println("Summe des Arrays 2,4,9,5,55,32,45 : " + arraySum(y));
		System.out.println("Position von es in Test : " + (firstPosOfSubstring("Test", "es")+1));
		System.out.println(nullstelle(-1.0,20.0,0.0001));
	}

	//Gibt Summe der Werte eines int-Arrays zurück
	public static int arraySum(int x[])
	{
		//Initialisierung der Summenvariable
		int sum = 0;

		//Iterierung über das Array zur einzelnen Addition der Werte in x[]
		for(int i = 0 ; i < x.length ; i++)
		{
			sum = sum + x[i];
		}

		//Rückgabe des Ergebnisses
		return  sum;
	}
	
	
	// Bestimmt die Position des ersten Vorkommens des Strings y im String x
	public static int firstPosOfSubstring(String x, String y)
	{
		//Schleife zum durchgehen der Buchstaben vom String x
		for(int a = 0; a < x.length();a++)
		{
			//Initialisierung eines Hilfsschalters
			boolean s = true;
      
			//Schleife zum durchgehen der Buchstaben vom String y
			for(int b = 0; b < y.length();b++)
			{
      
				//Abfrage zum Ablgeichen der Buchstaben von x und y
				if (x.charAt(a+b)!=y.charAt(b))
				{
					//bei nicht passenden Buchstaben Abbruch des abgleichs der buchstaben vom String y
					s = false;
					break;
				}
			}
      
			//Abfrage des Hilfsschalter um festzustellen ob die Überprüfung der Buchstaben von y Erfolgreich war
			//wenn ja Rückgabe der Position von y in x
			if(s)
			{
				return a;
			}
		}
    
		//Bei Erfolgloser Überprüfung Rückgabe des Fehlerwertes -1
		return -1;
	}
	
	
	//Implementireung des Algorithmus, um eine Annäherung der Nullstelle, zwischen x und y, für die Funktion f(x),
	//mithilfe der Intervallschachtellung zu finden, unter Berücksichtigung des Offsets z.
	public static double nullstelle(double x, double y, double z)
	{
		double m = (x+y)/2;
		if(Math.abs(f(m))<z)
		{
			return m;
		}
		else
		{
			if( ((f(x)<0) && (f(m)<0)) || ((f(x)>0) && (f(m)>0)) )
			{
				return nullstelle(m,y,z);
			}
			else
			{
				return nullstelle(x,m,z);
			}
		}
	}

	//Implementierung der Funktion f(x) = e^x + x^2 - 4
	public static double f(double x)
	{
		return  Math.exp(x) + x*x -4;
	}
}
