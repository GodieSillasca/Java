import java.util.ArrayList;

public class Pokemon{
	private String nombre;
	private int vida;
	private ArrayList<String> tipo = new ArrayList();
	private int nivel;
	private int ataqueFisico;
	private int ataqueEspecial;
	private int defensaFisica;
	private int defensaEspecial;
	private int velocidad;

	Pokemon(String nombre,int vida, ArrayList<String> tipo, int nivel, int ataqueFisico, int ataqueEspecial, int defensaFisica, int defensaEspecial, int velocidad){
		setNombre(nombre);
		setVida(vida);
		setTipo(tipo);
		setNivel(nivel);
		setAtaqueFisico(ataqueFisico);
		setAtaqueEspecial(ataqueEspecial);
		setDefensaFisica(defensaFisica);
		setDefensaEspecial(defensaEspecial);
		setVelocidad(velocidad);
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setVida(int vida){
		this.vida = vida;
	}

	public int getVida(){
		return vida;
	}

	public void setTipo(ArrayList<String> tipo){
		this.tipo = tipo;
	}

	public void getTipo(){
		for(int i = 0; i < tipo.size(); i++){
			System.out.println(tipo.get(i));
		}
	}

	public void setNivel(int nivel){
		this.nivel = nivel;
	}

	public int getNivel(){
		return nivel;
	}

	public void setAtaqueFisico(int ataqueFisico){
		this.ataqueFisico = ataqueFisico;
	}

	public int getAtaqueFisico(){
		return ataqueFisico;
	}

	public void setAtaqueEspecial(int ataqueEspecial){
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getAtaqueEspecial(){
		return ataqueEspecial;
	}

	public void setDefensaFisica(int defensaFisica){
		this.defensaFisica = defensaFisica;
	}

	public int getDefensaFisica(){
		return defensaFisica;
	}

	public void setDefensaEspecial(int defensaEspecial){
		this.defensaEspecial = defensaEspecial;
	}

	public int getDefensaEspecial(){
		return defensaEspecial;
	}

	public void setVelocidad(int velocidad){
		this.velocidad = velocidad;
	}

	public int getVelocidad(){
		return velocidad;
	}

}