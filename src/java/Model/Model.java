/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Service.HolaService;
//import controller.Nombre;
import controller.Cliente;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author usuario
 */
public class Model{
    

     public ModelAndView Submit(Object command, HolaService holaService,
             String s) {
    // Nombre nombre= (Nombre) command;
     Cliente nombre = (Cliente) command;
     ModelAndView mv = new ModelAndView(s);
     //String nombre, String cOrigen, String cDestino, String fIda, String fRegreso, String cantidad){
    // mv.addObject("holaMensaje", holaService.diHola(nombre.getValor(),nombre.getcOrigen(),nombre.getcDestino(),nombre.getfIda(),nombre.getCantidad()));
     mv.addObject("holaMensaje", holaService.borrar(nombre));
     return mv;
     }
}
