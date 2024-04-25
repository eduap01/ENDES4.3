package practica_animales;

public class Tigre extends Depredador {
    public Tigre(String especie) {
        super(especie, "Tigre");
    }

    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + ", Tipo: " + this.tipoAnimal + ", Vivo: " + this.vivo;
    }
}
