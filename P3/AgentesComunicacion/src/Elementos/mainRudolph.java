package Elementos;


// Añadimos al agente : RUDOLPH
import Rudolph.AgenteRudolph;

import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

/**
 * @author Teresa Reyes García.
 */
public class mainRudolph {
    
    public static void main(String[] args) {
       // Creamos el contenedor de los agentes.
        Runtime rt = Runtime.instance();

        Profile p = new ProfileImpl();
        AgentContainer container = rt.createMainContainer(p);
        
        // Crear y lanzar el agente. Uso de try catch para mostrar errores en caso de fallo.
        try {
           AgentController ac = container.createNewAgent("AgenteRudolph","Rudolph.AgenteRudolph", null);
            ac.start();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
}