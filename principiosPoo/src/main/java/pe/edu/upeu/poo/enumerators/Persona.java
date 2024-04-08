
package pe.edu.upeu.poo.enumerators;
enum GENERO{Femenino,Masculino}
enum ESTADO_CIVIL{Casado, Divorciado, Soltero}

public class Persona {
    public static void main(String[] args) {
        System.out.println("GENERO: "+GENERO.Masculino);
        for (ESTADO_CIVIL i: ESTADO_CIVIL.values()) {
            System.out.println("-"+i);
            
            
        }
       
            
        
    }  
}
