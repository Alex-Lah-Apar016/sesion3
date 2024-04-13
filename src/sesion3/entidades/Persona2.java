/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

/**
 *
 * @author Estudiante
 */
public class Persona2 
{
    private PersonaDatosBasicos dataB;
    private PersonaDatosCcontacto dataC;
    private PersonaDatosRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosCcontacto dataC,PersonaDatosRegistro dataR)
    
    {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;      
}
    
    
    
    public PersonaDatosBasicos getDataB()
    {
        return dataB;
    }

    public void setDataB(PersonaDatosBasicos dataB)
    {
        this.dataB = dataB;
    }

    public PersonaDatosCcontacto getDataC()
    {
        return dataC;
    }

    public void setDataC(PersonaDatosCcontacto dataC) 
    {
        this.dataC = dataC;
    }

    public PersonaDatosRegistro getDataR() 
    {
        return dataR;
    }

    public void setDataR(PersonaDatosRegistro dataR) 
    {
        this.dataR = dataR;
    }

}
