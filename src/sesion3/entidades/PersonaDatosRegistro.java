/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

/**
 *
 * @author Estudiante
 */
public class PersonaDatosRegistro 
{

   private String asuario;
   private String contraseña;
   private String email;

    public PersonaDatosRegistro(String asuario, String contraseña, String email) {
        this.asuario = asuario;
        this.contraseña = contraseña;
        this.email = email;
    }
    
   
   
    public String getAsuario()
    {
        return asuario;
    }

    public void setAsuario(String asuario) 
    {
        this.asuario = asuario;
    }

    public String getContraseña() 
    {
        return contraseña;
    }

    public void setContraseña(String contraseña) 
    {
        this.contraseña = contraseña;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
  
}
