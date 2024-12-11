package com.mycompany.calcuclientemaven;

import com.mycompany.calcuclientemaven.client.WScalcu;
import com.mycompany.calcuclientemaven.client.WScalcu_Service;

public class TestCliente {
    public static void main(String[] args) {
        // Crear una instancia del servicio y del puerto
        WScalcu_Service service = new WScalcu_Service();
        WScalcu port = service.getWScalcuPort();

        // Llamada a métodos del servicio web
        int suma = port.sumar(5, 10);
        System.out.println("Resultado de la suma: " + suma);

        int resta = port.restar(15, 5);
        System.out.println("Resultado de la resta: " + resta);

        int multiplicacion = port.multiplicar(4, 3);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);

        try {
            int division = port.dividir(10, 2);
            System.out.println("Resultado de la división: " + division);
        } catch (Exception e) {
            System.out.println("Error en la división: " + e.getMessage());
        }

        // Obtener el contador de operaciones
        int contador = port.getContadorPeticiones();
        System.out.println("Contador de operaciones: " + contador);
    }
}
