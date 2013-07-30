/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import controller.Cliente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author yepesk8r
 */
public class ClienteService {
    Session session=null;
    public ClienteService(){
    this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public String crear(Cliente cliente){
        System.out.println("antes de comenzar la transaccion"+cliente.getCId()+cliente.getCNombre()+cliente.getCTipo());
            try{
            // se obtiene la sesion
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.save(cliente);
            s.getTransaction().commit();
            return  "Cliente id:" + cliente.getCId()+ " con el nombre " + cliente.getCNombre()+ " tipo de cliente: "
                    + cliente.getCTipo()+" fue guardado ";
            
        } catch ( Exception e) {
        e.printStackTrace();
        return "Error";
        }
    }
    
    public List getClientes() {
    List<Cliente> cliente = null;
    try{
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Cliente as cliente");
        cliente = (List<Cliente>) q.list();
    }catch(Exception e){
        e.printStackTrace();
    }    
          return cliente;      
    }
    
    public String actualizar_Cliente(Cliente cliente) {
        try {
            System.out.println(cliente.getCId() + cliente.getCNombre() + cliente.getCTipo());
            // se obtiene la sesion
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.update(cliente);
            s.getTransaction().commit();
            return "Cliente actualizado" + cliente.getCId() + " " + cliente.getCNombre() + " "
                    + cliente.getCTipo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }
         public String borrar_Cliente(Cliente cliente){
        try{
            // se obtiene la sesion
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.delete(cliente);
            s.getTransaction().commit();
            return  "Cliente Borrado";
            
                   
        } catch ( Exception e) {
        e.printStackTrace();
        }
        return "Error";
    }  
}
