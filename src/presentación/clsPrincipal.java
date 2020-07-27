/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;

import Cola.Cola;
import Lista.clsListaSimple;
import Lista.clsListaDoble;
import Lista.clsListaCircular;

/**
 *
 * @author pc
 */
public class clsPrincipal {
    public static void main(String[] args) {
        clsListaCircular obj = new clsListaCircular();
        obj.insertarDerecha(10);
        obj.insertarDerecha(30);
        obj.insertarDerecha(100);
        obj.insertarDerecha(45);
        obj.eliminarDerecha();
        obj.insertarDerecha(410);
    }
}
