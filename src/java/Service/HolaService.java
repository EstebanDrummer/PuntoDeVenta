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
    public String diHola(String nombre, String cOrigen, String cDestino, String fIda, String fRegreso, String cantidad){
        return "Usted "+nombre +" desea viajar de "+cOrigen+" hacia "+cDestino +" el dia "+fIda+" y regresar el dia "+fRegreso+"para "+cantidad+" personas";
    }
}
