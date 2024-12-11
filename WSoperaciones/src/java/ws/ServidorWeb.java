/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author zurie
 */
@WebService(serviceName = "ServidorWeb")
public class ServidorWeb {

    private int contadorOperaciones;

    public ServidorWeb() {
        this.contadorOperaciones = 0;
    }

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod
    public int sumar(int a, int b) {
        contadorOperaciones++;
        return (a + b);
    }

    @WebMethod
    public int restar(int a, int b) {
        contadorOperaciones++;
        return (a - b);
    }

    @WebMethod
    public int multiplicar(int a, int b) {
        contadorOperaciones++;
        return (a * b);
    }

    @WebMethod
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        contadorOperaciones++;
        return (a / b);
    }

    @WebMethod
    public int getContadorPeticiones() {
        return this.contadorOperaciones;
    }
}