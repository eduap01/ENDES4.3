package practica_animales;

import Main.DepredadorInterf;

public abstract class Depredador extends Animal implements DepredadorInterf {
    public Depredador(String nombreAnimal, String tipoAnimal) {
        super(nombreAnimal, tipoAnimal);
    }

    @Override
    public void cazar(Presa presa) {
        float n = (float)(Math.random());


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

    @Override
    public String observar(Presa presa) {
        return this.especie + " está observando a " + presa.especie;
    }
    
    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + "\nTipo: " + this.tipoAnimal + "\nVivo: " + this.vivo;
    }

}

