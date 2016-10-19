public class Person 
{
	String nachname;
	String vorname;
	boolean geschlecht;


    
	public Person (String nachname, String vorname, boolean geschlecht) 
	{
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
	}

 
    
	public String anrede () 
	{
		if (geschlecht) return "Frau" + vorname + " " + nachname;
		else return "Herr" + vorname + " " + nachname;

	}
}
