/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import Service.HolaService;

/**
 *
 * @author yepesk8r
 */
public class HolaController extends SimpleFormController {
    
    HolaService holaService;
    
    public void setHolaService(HolaService holaService){
        this.holaService= holaService;
    }
    
    public HolaController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Nombre.class);
        setCommandName("nombre");//nombre del comando que va en el modelo
        setSuccessView("holaView");//se lanza si es exitosa, despues del envio correcto
        setFormView("nombreView");//vista para mostrar formulario que lanza 
    }
//    
//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
     
    //para nuestro propio modelandView
     @Override
     protected ModelAndView onSubmit(Object command) throws Exception {
         Model m = new Model();
       ModelAndView mv;
       mv = m.Submit(command,this.holaService,getSuccessView());
     return mv;
     }
}