
public class Town {
	private String name;
	private String country;
	private int population;
	
	public Town(String name,String country,int population){
		super();
		this.name=name;
		this.country=country;
		this.population=population;
	}
	
	public String toString(){
		return "Town [name="+name+",country="+country+",population="+population+ "]";
	}
	

}
