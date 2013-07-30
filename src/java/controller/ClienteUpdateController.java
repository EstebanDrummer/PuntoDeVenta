/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import Service.ClienteService;

/**
 *
 * @author yepesk8r
 */
public class ClienteUpdateController extends SimpleFormController{
    
    ClienteService clienteService;
    
    public void setClienteService(ClienteService clienteService){
        this.clienteService =clienteService;
    }
    
    public ClienteUpdateController(){
        
        setCommandClass(Cliente.class);
        setCommandName("cliente");
        setSuccessView("clienteUpdate2View");
        setFormView("clienteUpdate1View");
    }
    
    @Override
    protected ModelAndView onSubmit(Object command)throws Exception{
            Model m=new Model();
            ModelAndView mv;
            mv=m.Submit(command, this.clienteService , getSuccessView());
        return mv;
    }
    
}
