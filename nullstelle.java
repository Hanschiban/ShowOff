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
