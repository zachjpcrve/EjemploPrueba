/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiveterinaria;

public class Dueño {
    private String nombre;
    private int telefono;
    private String direccion;
    private String distrito;
    Mascota masc=new Mascota();
    
    public void ingresarNombre(String Nombre){
        nombre=Nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void ingresarDireccion(String Direccion){
        direccion=Direccion;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public void ingresarTelefono(int Telefono){
        telefono=Telefono;
    }
    public int obtenerTelefono(){
        return telefono;
    }
    public void ingresarDistrito(String Distrito){
        distrito=Distrito;
    }
    public String obtenerDistrito(){
        return distrito;
    }
    public void ingresarDatosMascota(String NomMas,String esp,String Raza,String Sexo,String Color,int dia,int mes,int año){
        masc.ingresarNombre(NomMas);
        masc.ingresarEspecie(esp);
        masc.ingresarRaza(Raza);
        masc.ingresarSexo(Sexo);
        masc.ingresarColor(Color);
        masc.ingresarFechaNac(dia,mes,año);
    }
}
