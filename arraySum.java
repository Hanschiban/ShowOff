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
