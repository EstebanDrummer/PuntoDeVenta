/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author yepesk8r
 */

import controller.Nombre;
import controller.Cliente;
import org.hibernate.Session;

public class HolaService {
    Session session = null;
    public HolaService() {
        //this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    //toma nombre como parametro y devuelve un String
    public String diHola(String nombre, String cOrigen, String cDestino, String fIda, String cantidad){
        return "Usted "+nombre +" desea viajar de "+cOrigen+" hacia "+cDestino +" el dia "+fIda+"para "+cantidad+" persona(s)";
    }/*
    public String diHola(String nombre){
        return "Usted "+nombre +" hola";
    }*/
    
    public String borrar(Cliente nombre)
    {   System.out.println("antes de comenzar la transaccion");
            try{
            // se obtiene la sesion
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            System.out.println("antes de comenzar la transaccion");
            s.beginTransaction();
            s.delete(nombre);
            s.getTransaction().commit();  
            return "borrado con exito";
        } catch ( Exception e) {
        e.printStackTrace();
        return "Error";
        }
    }
    
}
