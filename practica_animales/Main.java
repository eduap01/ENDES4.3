package Main;

import practica_animales.*;

public class Main {

	public static void main(String[] args) {
		Leon leon = new Leon("Simba");
		Tigre tigre = new Tigre("Shere Khan");
        Gacela gacela = new Gacela("Bambi");
        Rana rana = new Rana("Gustavo");

        leon.cazar(gacela); 
        System.out.println(leon.observar(rana)); 

        System.out.println(gacela.huir(tigre));

        System.out.println(leon.getInfo()); 
        System.out.println(gacela.getInfo()); 
        
        //Esto es un cambio que he hecho para ENDES
        System.out.println("Hola");

	}

}
