/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiveterinaria;
import java.util.Random;
/**
 *
 * @author H61WW64BIT
 */
public class HistoriaClinica {
    Dueño due=new Dueño();
    Random aleatorio=new Random();
    private int codigo;
    public void asignarCodigo(){
        int cod=1+aleatorio.nextInt(9999);
        codigo=cod;
    }
    public void ingresarDatosDueño(String Nom,String Dir,String Dis,int Tf,String NomMas,String esp,String Rza,String Sx,String Clr,int d,int m,int a){
        due.ingresarNombre(Nom);
        due.ingresarDireccion(Dir);
        due.ingresarDistrito(Dis);
        due.ingresarTelefono(Tf);
        due.ingresarDatosMascota(NomMas,esp,Rza,Sx,Clr,d,m,a);
    }
    public int obtenerCodigo(){
        return codigo;
    }
    public String MostrarNombreDueño(){
        return due.obtenerNombre();
    }
    public String MostrarDireDueño(){
        return due.obtenerDireccion();  
    }
    public String MostrarDistriDueño(){
        return due.obtenerDistrito(); 
    }
    public int MostarTelefono(){
        return due.obtenerTelefono();
    }
    public String MostrarNomMas(){
        return due.masc.obtenerNombre();
    }
    public String MostrarEsp(){
        return due.masc.obtenerEspecie(); 
    }
    public String MostrarRaza(){
        return due.masc.obtenerRaza(); 
    }
    public String MostrarSexo(){
        return due.masc.obtenerSexo();
    }
    public String MostrarColor(){
        return due.masc.obtenerColor();
    }
    public int MostrarDia(){
        return due.masc.obtenerDia();
    }
    public int MostrarMes(){
        return due.masc.obtenerMes();
    }
    public int MostrarAño(){
        return due.masc.obtenerAño();  
    }
}
