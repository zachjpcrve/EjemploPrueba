/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiveterinaria;

public class BancoDeHistorias {
    HistoriaClinica hist[]= new HistoriaClinica[100];
    private static int indice=0;
    public BancoDeHistorias(){
        for(int i=0;i<100;i++){
            hist[i]=new HistoriaClinica();
        }
    }
    public void crearHistoria(String Nom,String Dir,String Dis,int Tf,String NomMas,String esp,String Rza,String Sx,String Clr,int d,int m,int a){
        hist[indice].asignarCodigo();
        hist[indice].ingresarDatosDueño(Nom,Dir,Dis,Tf,NomMas,esp,Rza,Sx,Clr,d,m,a);
        indice++;
    }
    public int MostrarCodigo(int ind){
        return hist[ind].obtenerCodigo();
    }
    public String MostrarNombreDueño(int ind){
        return hist[ind].due.obtenerNombre();
    }
    public String MostrarDireDueño(int ind){
        return hist[ind].due.obtenerDireccion();  
    }
    public String MostrarDistriDueño(int ind){
        return hist[ind].due.obtenerDistrito(); 
    }
    public int MostarTelefono(int ind){
        return hist[ind].due.obtenerTelefono();
    }
    public String MostrarNomMas(int ind){
        return hist[ind].due.masc.obtenerNombre();
    }
    public String MostrarEsp(int ind){
        return hist[ind].due.masc.obtenerEspecie(); 
    }
    public String MostrarRaza(int ind){
        return hist[ind].due.masc.obtenerRaza(); 
    }
    public String MostrarSexo(int ind){
        return hist[ind].due.masc.obtenerSexo();
    }
    public String MostrarColor(int ind){
        return hist[ind].due.masc.obtenerColor();
    }
    public int MostrarDia(int ind){
        return hist[ind].due.masc.obtenerDia();
    }
    public int MostrarMes(int ind){
        return hist[ind].due.masc.obtenerMes();
    }
    public int MostrarAño(int ind){
        return hist[ind].due.masc.obtenerAño();  
    }
    public int buscarNombre(String nombre){
        int i=0;
        int sw=0;
        int ind=0;
        while(i<indice && sw==0){
            if(nombre == null ? hist[i].due.obtenerNombre() == null : nombre.equals(hist[i].due.obtenerNombre())){
                sw=1;
                ind=i;
            }
            i++;
        }
        return sw+ind;
    }
}
