package practica_animales;

import Main.DepredadorInterf;
import Main.PresaInterf;
import practica_animales.*;

public abstract class Mixto extends Animal implements DepredadorInterf, PresaInterf {
    public Mixto(String especie, String tipoAnimal) {
        super(especie, tipoAnimal);
    }

    @Override
    public void cazar(Presa presa) {
    	float n = (float)(Math.random());
    	
    	if(presa.tipoAnimal == this.tipoAnimal) {
    		if (n < 0.5) {
	        	System.out.println(this.especie + " ha cazado a " + presa.especie);
	        }
	
	        else if (n > 0.9) {
	        	System.out.println(this.especie + " ha muerto mientras cazaba a " + presa.especie);
	        }
	
	        else if (n >=0.5 && n<=0.9) {
	            System.out.println(presa.especie + " ha escapado");
	        }
    	}
    }

    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + "\nTipo: " + this.tipoAnimal + "\nVivo: " + this.vivo;
    }
}
