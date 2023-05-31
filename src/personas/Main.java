package personas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nombre, cedula, universidad, carrera;
       int op;
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();
       do {
           System.out.println("1. Ingresar Alumno de pregrado");
           System.out.println("2. Imprimir personas");
           System.out.println("3. Salir");
           System.out.print("Ingrese una opción: ");
           op = Integer.parseInt(sc.next());
           switch(op){
               case 1:{
                   System.out.print("Ingreso la cedula: ");
                   cedula = sc.next();
                   System.out.print("Ingrese el nombre: ");
                   nombre = sc.next();
                   System.out.print("Ingrese la universidad: ");
                   universidad = sc.next();
                   System.out.print("Ingrese la carrera: ");
                   carrera = sc.next();
                   personas.add(new AlumnoPregrado(nombre,cedula,universidad,carrera));

               }break;
               case 2:{
                   for(Persona p:personas){
                       System.out.println(p);
                   }
               }break;

           }


       }while(op != 3);

    }
}
