
public class Personenliste 
{

	int anzahl;
	Person[] personen;
	boolean[] anwesend;
	
	
	public Personenliste ()
	{
		anzahl = 0;
		personen = new Person[1000];
		anwesend = new boolean[1000];
	}
	
	public void hinzufügen (Person x)
	{
		if (anzahl < 1000)
		{
			personen[anzahl] = x;
			anwesend[anzahl] = false;
			anzahl++;
		}
	}
	
	public int find(Person x)
	{
		for(int y = 0; y < anzahl; y++)
		{
			if((personen[y].vorname.equals(x.vorname))&&(personen[y].nachname.equals(x.nachname)))
			{
				return y;
			}
		}
		return -1;
	}
	
	public void entfernen (Person x)
	{
		int index = find(x);
		if(index!=-1)
		{
			for(int y = index; y < anzahl; y++)
			{
				if(y<999)
				{
					personen[y] = personen[y+1];
					anwesend[y] = anwesend[y+1];
				}
				else
				{
					personen[999] = null;
					anwesend[999] = false;
				}
			}
			anzahl--;
		}
	}
	
	public void kommt (Person x)
	{
		int index = find(x);
		if(index!=-1)
		{
			anwesend[index] = true;
		}
	}
	
	public void geht (Person x)
	{
		int index = find(x);
		if(index!=-1)
		{
			anwesend[index] = false;
		}
	}
	
	public Arzt findeArzt (String vorname,String nachname)
	{
		for(int y = 0; y < anzahl; y++)
		{
			if(personen[y].getClass() == Arzt.class)
			{
				if((personen[y].vorname.equals(vorname))&&(personen[y].nachname.equals(nachname)))
				{
					return (Arzt)personen[y];
				}
			}
		}
		return null;
	}
}
