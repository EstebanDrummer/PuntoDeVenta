/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Service.HolaService;
import controller.Nombre;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author usuario
 */
public class Model{
    

     public ModelAndView Submit(Object command, HolaService holaService,
             String s) {
     Nombre nombre= (Nombre) command;
     ModelAndView mv = new ModelAndView(s);
     mv.addObject("holaMensaje", holaService.diHola(nombre.getValor()));
     return mv;
     }
}
