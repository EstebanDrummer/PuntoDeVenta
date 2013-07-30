/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Service.ClienteService;
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
     public ModelAndView Submit(Object command, ClienteService clienteService,
             String c) {
    // Nombre nombre= (Nombre) command;
         System.out.println("esta es la "+c);
     Cliente cliente = (Cliente) command;
     ModelAndView mv = new ModelAndView(c);
     //String nombre, String cOrigen, String cDestino, String fIda, String fRegreso, String cantidad){
    // mv.addObject("holaMensaje", holaService.diHola(nombre.getValor(),nombre.getcOrigen(),nombre.getcDestino(),nombre.getfIda(),nombre.getCantidad()));
     if(c.equals("cliente2View")){
     mv.addObject("clienteMensaje", clienteService.crear(cliente));}
     if(c.equals("clienteRead2View")){
     mv.addObject("clienteMensaje",clienteService.getClientes());}
     if(c.equals("clienteUpdate2View")){
     mv.addObject("clienteMensaje",clienteService.actualizar_Cliente(cliente));}
     if(c.equals("clienteDelete2View")){
     mv.addObject("clienteMensaje",clienteService.borrar_Cliente(cliente));}
     return mv;
     }
}
