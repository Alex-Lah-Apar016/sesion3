/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import sesion3.entidades.Persona2;
import sesion3.entidades.PersonaDatosBasicos;
import sesion3.entidades.PersonaDatosCcontacto;
import sesion3.entidades.PersonaDatosRegistro;
import sesion3.entidades.perosns;

/**
 *
 * @author Estudiante
 */
public class Sesion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
       perosns per = new perosns();
       per.setNombre("Juan");
       per.setApellido("Diaz");
       per.setDni("00055555");
       per.setDireccion("av Manzanitas 456");
       per.setTelefono("991847595");
       per.setCorreo("juan.diaz@upn.pe");
       per.setAsuario("Juanchis16");
       per.setContraseña("123456");
       per.setEmail("juan.diaz@gmail.com");
       
        PersonaDatosBasicos dataB =
               new PersonaDatosBasicos("Juan","diaz","000555");
        PersonaDatosCcontacto dataC =
               new PersonaDatosCcontacto("av Manzanitas 456","991847595","uan.diaz@upn.pe");
        PersonaDatosRegistro dataR =
               new PersonaDatosRegistro("Juanchis16","123456","juan.diaz@gmail.com");
               
        Persona2 per2 = new Persona2(dataB,dataC,dataR);
         
        
       
       
       
       
    }
    
}
