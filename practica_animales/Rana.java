package practica_animales;

public class Rana extends Presa {
    public Rana(String especie) {
        super(especie, "Rana");
    }

    @Override
    public String getInfo() {
        return "Nombre: " + this.especie + ", Tipo: " + this.tipoAnimal + ", Vivo: " + this.vivo;
    }
}

