/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiveterinaria;
public class Mascota {
    private String nombre;
    private String especie;
    private int dia;
    private int mes;
    private int año;
    private String color;
    private String raza;
    private String sexo;
    
    public void ingresarEspecie(String esp){
        especie=esp;
    }
    public String obtenerEspecie(){
        return especie;
    }
    public void ingresarNombre(String Nombre){
        nombre=Nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void ingresarFechaNac(int Dia,int Mes,int Año){
        dia=Dia;
        mes=Mes;
        año=Año;
    }
    public int obtenerDia(){return dia;}
    public int obtenerMes(){return mes;}
    public int obtenerAño(){return año;}
    public void ingresarRaza(String Raza){
        raza=Raza;
    }
    public String obtenerRaza(){
        return raza;
    }
    public void ingresarSexo(String Sexo){
        sexo=Sexo;
    }
    public String obtenerSexo(){
        return sexo;
    }
    public void ingresarColor(String Color){
        color=Color;
    }
    public String obtenerColor(){
        return color;
    }
}
