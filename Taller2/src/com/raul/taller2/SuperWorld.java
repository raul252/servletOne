package com.raul.taller2;
import java.util.ArrayList;
import java.util.Collections;

public class SuperWorld {
	private String word;

	public SuperWorld(String word)
	{
		this.word = word;
	}
	
	public ArrayList<Vocal> numberVocal(){
		ArrayList<Vocal> datavocal = new ArrayList<>();
	    char[] valores = word.toCharArray();
	    char vocal;
	    int numbera = 0;
	    int numbere = 0;
	    int numberi = 0;
	    int numbero = 0;
	    int numberu = 0;
	    SuperWorld.Vocal a = null;
	    SuperWorld.Vocal e = null;
	    SuperWorld.Vocal i = null;
	    SuperWorld.Vocal o = null;
	    SuperWorld.Vocal u = null;
	    for(int counter=0; counter<valores.length; counter++)
	    {
	    	vocal = valores[counter];
	    	switch(vocal)
	    	{
	    	case 'a':
	    		if (numbera == 0) {
	    			numbera++;
		    		a = new Vocal(vocal, numbera);
		    		datavocal.add(a);
	    		}
	    		else
	    		{
	    			numbera++;
	    			a.number = numbera;
	    		}
	    	break;
	    	case 'e':
	    		if (numbere == 0) {
	    			numbere++;
		    		e = new Vocal(vocal, numbere);
		    		datavocal.add(e);
	    		}
	    		else
	    		{
	    			numbere++;
	    			e.number = numbere;
	    		}
	    	break;
	    	case 'i':
	    		if (numberi == 0) {
	    			numberi++;
		    		i = new Vocal(vocal, numberi);
		    		datavocal.add(i);
	    		}
	    		else
	    		{
	    			numberi++;
	    			i.number = numberi;
	    		}
	    	break;
	    	case 'o':
	    		if (numbero == 0) {
	    			numbero++;
		    		o = new Vocal(vocal, numbero);
		    		datavocal.add(o);
	    		}
	    		else
	    		{
	    			numbero++;
	    			o.number = numbero;
	    		}
	    	break;
	    	case 'u':
	    		if (numberu == 0) {
	    			numberu++;
		    		u = new Vocal(vocal, numberu);
		    		datavocal.add(u);
	    		}
	    		else
	    		{
	    			numberu++;
	    			u.number = numberu;
	    		}
	    	break;
	    	}
	    }
		return datavocal;
	}
	
	public boolean isPalindrom()
	{
		//Obtener carácteres de una palabra
		char[] valores = word.toCharArray();
		//Eliminar espacios
		String valores2 = "";
		for (int i = 0; i<valores.length; i++)
		{
			if (valores[i] != ' ')
			{
				valores2 +=valores[i];
			}
		}
		valores = valores2.toCharArray();
		int mitad1 = valores.length/2;
		ArrayList<String> datamitad1 = new ArrayList<>();
		ArrayList<String> datamitad2 = new ArrayList<>();
		for(int i=0; i<mitad1+1; i++)
		{
			char vocal = valores[i];
			datamitad1.add(Character.toString(vocal));
		}

		for(int i=valores.length-1; i>(mitad1-1); i--)
		{
			char vocal = valores[i];
			datamitad2.add(Character.toString(vocal));
		}
		
		Collections.sort(datamitad1);
	    Collections.sort(datamitad2);      
	    return datamitad1.equals(datamitad2);
	}
	
	public String reflect()
	{
		return "";
	}
	
	public static class Vocal{
		private char vocal;
		private int number;
		
		public Vocal(char vocal, int number)
		{
			
			this.vocal = vocal;
			this.number = number;
		}
		
		public char getVocal()
		{
			return vocal;
		}
	}
}
