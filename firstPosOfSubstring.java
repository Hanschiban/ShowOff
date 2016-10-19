// Die Methode bestimmt die Position des ersten Vorkommens des Strings y im String x

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
