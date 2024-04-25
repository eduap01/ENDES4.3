package practica_animales;

public class Leon extends Depredador {
    //primer comentario de ivan
    public Leon(String especie) {
        super(especie, "León");
    }

    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + ", Tipo: " + this.tipoAnimal + ", Vivo: " + this.vivo;
    }
}
