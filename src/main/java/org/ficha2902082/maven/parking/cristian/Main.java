package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Registro;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // crear dos cupos
        // Instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B',
                5.0,
                2.5);

        // crear dos carros
        Carro carrito1 = new Carro();
        carrito1.placa = "RAP 527";
        carrito1.tipoVehiculo = TipoVehiculo.MOTO;

        Carro carrito2 = new Carro();
        carrito2.placa = "RAP 420";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito3 = new Carro("ASD 123", TipoVehiculo.TAXI);

        Cliente cliente1 = new Cliente("GIGI", "CORTES", TipoDocumento.CC, 1000240511L, 3196867912L);

        // vincular carros al cliente
        cliente1.addCar(carrito1);
        cliente1.addCar("RAP 527",
                TipoVehiculo.MOTO);

        Cliente cliente2 = new Cliente("GIGI", "BALLESTEROS", TipoDocumento.CC, 100021L, 319912L);

        // vincular carros al cliente

        cliente2.addCar(carrito2);
        cliente1.addCar("RAP 420",
                TipoVehiculo.CAMIONETA);

        // declaro list, de registros
        List<Registro> misregistros = new ArrayList<>();

        // crea dos fregistros dfe entrada y saliuda
        // instanciar dos refrigerios E/S

        Registro registro1 = new Registro(
                LocalDate.of(2024, Month.JANUARY, 22),
                LocalTime.of(16, 40, 35),
                LocalDate.of(2024, Month.JULY, 7),
                LocalTime.of(7, 7, 7),
                50000.00,
                cliente1.misCarros.get(0),
                cupito1

        );

        Registro registro2 = new Registro(
                LocalDate.of(2023, Month.DECEMBER, 23),
                LocalTime.of(7, 7, 7),
                LocalDate.of(2024, Month.JANUARY, 2),
                LocalTime.of(7, 7, 7),
                300000.00,
                cliente2.misCarros.get(0),
                cupito2);
        // vincular los registros a la lista
        // de registros
        misregistros.add(registro1);
        misregistros.add(registro2);
        // recorrer la lista de registros
        for (Registro r : misregistros) {
            System.out.println(" Placa: " + r.carro.placa + "|" + " Cupo: " + r.cupo.letra + "|" +
                    "Valor: " + r.valor + "|" + "fecha de inicio " + r.fechaInicio.toString() + "|" + "Hora Fin: "
                    + r.fechaFin.toString());
        }
    }
}