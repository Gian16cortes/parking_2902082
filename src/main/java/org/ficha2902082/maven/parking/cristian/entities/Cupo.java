package org.ficha2902082.maven.parking.cristian.entities;

public class Cupo {

    public char letra;
    public double largo;
    public double ancho;

    // constructor por defecto
    public Cupo() {

    }

    // constructor con parametros

    public Cupo(char letra, double largo, double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

    // constructor de clase
    // def: metodo especial en una entidad -- se ejecuta automaticamente cuando se
    // crea un objeto :instancia

}
