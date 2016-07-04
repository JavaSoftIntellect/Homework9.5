import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Set<Town> towns = new HashSet<Town>();
		Town a = new Town("Varna","Bulgaria",330000);
		Town b = new Town("Sofia","Bulgaria",1800000);
		Town c = new Town("Plovdiv", "Bulgaria",450000);
		Town d = new Town("Burgas","Bulgaria",340000);
		Town e = new Town("Peshtera","Bulgaria",25000);
		towns.add(a);
		towns.add(b);
		towns.add(c);
		towns.add(d);
		towns.add(e);
		
		for(Town one: towns){
			System.out.println(one);
		}System.out.println();
		if(towns.contains(c)){
			towns.remove(c);
		}if (towns.contains(c))
			towns.remove(c);

		for (Town one : towns)
			System.out.println(a);
	}

}
