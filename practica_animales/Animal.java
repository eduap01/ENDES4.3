package practica_animales;

abstract class Animal {
    protected String especie;
    protected String tipoAnimal;
    protected boolean vivo;

    public Animal(String especie, String tipoAnimal) {
        this.especie = especie;
        this.tipoAnimal = tipoAnimal;
        this.vivo = true;
    }

    public abstract String getInfo();
    
    //Esto es un cambios en Animal para ENDES
}