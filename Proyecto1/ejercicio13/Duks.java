/**
*Clase que implementa la interfaz "Animal" y sobreescribe el método de esta.
*/
public class Duks implements Animal {

	public void say(){ //nuevo método que implementa say para la clase Dog
		String nombreclase = this.getClass().getName();
		System.out.println(nombreclase + " say 'quack'.");
	}
}