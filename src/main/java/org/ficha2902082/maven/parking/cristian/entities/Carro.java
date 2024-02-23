package org.ficha2902082.maven.parking.cristian.entities;

public class Carro {

    // sintaxis de atributos
    // 1. modificador de acceso
    // 2. Tipo de dato del atributo
    // 3. Nombre del atributo
    // (camel Case)
    public String placa;
    public TipoVehiculo tipoVehiculo;

    // constructor por defecto
    public Carro() {
    }

    // constructor con parametros
    public Carro(String placa,
            TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

}
