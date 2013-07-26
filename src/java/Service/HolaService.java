/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author yepesk8r
 */

//modelo del negocio, servicios
public class HolaService {
    //toma nombre como parametro y devuelve un String
    public String diHola(String nombre, String cOrigen, String cDestino, String fIda, String cantidad){
        return "Usted "+nombre +" desea viajar de "+cOrigen+" hacia "+cDestino +" el dia "+fIda+"para "+cantidad+" persona(s)";
    }/*
    public String diHola(String nombre){
        return "Usted "+nombre +" hola";
    }*/
}
