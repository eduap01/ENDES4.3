package practica_animales;

public class Gacela extends Presa {
    public Gacela(String especie) {
        super(especie, "Gacela");
    }

    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + ", Tipo: " + this.tipoAnimal + ", Vivo: " + this.vivo;
    }

}
