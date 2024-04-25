package practica_animales;

import Main.PresaInterf;

public abstract class Presa extends Animal implements PresaInterf {
    public Presa(String nombreAnimal, String tipoAnimal) {
        super(nombreAnimal, tipoAnimal);
    }

    @Override
    public String huir(Depredador depredador) {
        this.vivo = false;
        return this.especie + " huye de " + depredador.especie;
    }
    
    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + "\nTipo: " + this.tipoAnimal + "\nVivo: " + this.vivo;
    }
}
