package table;

import java.util.ArrayList;
import java.util.List;

public class TablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> maListe=new ArrayList<>();
List<String> maListe2=new ArrayList<>();
maListe.add(1);
maListe.add(3);
maListe.add(6);
maListe2.add("hello");
maListe2.add("java");
//méthode 1
for(int ls : maListe)
{
System.out.println(ls);	
}
//méthode 2
maListe2.forEach(
		elt->{
			System.out.println(elt);
		}
		// lambda/arrow function 
		);

System.out.println(maListe2.get(0));
	}
	

}
