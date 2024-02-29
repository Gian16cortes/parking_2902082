package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Registro;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.Empleado;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                // crear empleado
                Empleado empleado1 = new Empleado("jorgesito", 1234L);
                Empleado empleado2 = new Empleado("davidsito", 777L);
                Empleado empleado3 = new Empleado("tatianita", 222L);
                Empleado empleado4 = new Empleado("cesarito", 2727L);
                Empleado empleado5 = new Empleado("juliansito", 737373L);
                // crear dos cupos
                // Instanciar dos cupos:
                Cupo cupito1 = new Cupo();
                cupito1.ancho = 1.0;
                cupito1.largo = 4.5;
                cupito1.letra = 'A';

                Cupo cupito2 = new Cupo('B',
                                5.0,
                                2.5);
                Cupo cupito3 = new Cupo('c',
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
                cliente2.addCar("RAP 420",
                                TipoVehiculo.CAMIONETA);

                Cliente cliente3 = new Cliente("Santi", "Delgadp", TipoDocumento.CC, 100376021L, 31996666612L);

                // vincular carros al cliente

                cliente3.addCar(carrito3);
                cliente3.addCar("RAP 123",
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
                                cupito1,
                                empleado1

                );

                LocalDate fi1 = LocalDate.of(2023,
                                Month.DECEMBER,
                                24);
                LocalTime hi1 = LocalTime.of(11, 32, 0);

                LocalDate ff1 = LocalDate.of(2023,
                                Month.DECEMBER,
                                24);
                LocalTime hf1 = LocalTime.of(11, 32, 0);

                Double valorR2 = 50000.0;

                Registro r2 = new Registro(fi1, hi1, ff1, hf1, valorR2, cliente3.misCarros.get(0), cupito3, empleado2);
                Registro r3 = new Registro(fi1, hi1, ff1, hf1, valorR2, cliente1.misCarros.get(0), cupito3, empleado4);
                Registro r4 = new Registro(fi1, hi1, ff1, hf1, valorR2, cliente2.misCarros.get(0), cupito3, empleado5);
                // vincular los registros ala lista
                // de registros

                Registro registro2 = new Registro(
                                LocalDate.of(2023, Month.DECEMBER, 23),
                                LocalTime.of(7, 7, 7),
                                LocalDate.of(2024, Month.JANUARY, 2),
                                LocalTime.of(7, 7, 7),
                                300000.00,
                                cliente2.misCarros.get(0),
                                cupito2,
                                empleado3

                );
                // vincular los registros a la lista
                // de registros
                misregistros.add(registro1);
                misregistros.add(registro2);
                misregistros.add(r2);
                misregistros.add(r3);
                misregistros.add(r4);
                // recorrer la lista de registros
                for (Registro r : misregistros) {
                        System.out.println(" Placa: " + r.carro.placa + "|" + " Cupo: " + r.cupo.letra + "|" +
                                        "Valor: " + r.valor + "|" + "fecha de inicio: " + r.fechaInicio.toString() + "|"
                                        + "Hora Fin: "
                                        + r.fechaFin.toString() + "|" + "empleado: " + r.empleado.nombre + "|"
                                        + "codigo: " + r.empleado.codigo);
                }
        }
}