import java.util.ArrayList;

public class Jugador{
	private String nombre;
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

	Jugador(){

	}

	Jugador(String nombre){
		this.nombre = nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void getPokemon(Pokemon pok){
		pokemones.add(pok);
	}

	public void getPokemones(){
		for(int i = 0; i < pokemones.size(); i++){
			System.out.println(pokemones.get(i).getNombre());
		}
	}
}