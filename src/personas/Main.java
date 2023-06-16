package personas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nombre, cedula, universidad, carrera, maestria, materia;
       int op;
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();
       do {
           System.out.println("1. Ingresar Alumno de pregrado");
           System.out.println("2. Ingresar Alumno de posgrado");
           System.out.println("3. Ingresar Profesor");
           System.out.println("4. Imprimir personas");
           System.out.println("5. Salir");
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
                   System.out.print("Ingreso la cedula: ");
                   cedula = sc.next();
                   System.out.print("Ingrese el nombre: ");
                   nombre = sc.next();
                   System.out.print("Ingrese la universidad: ");
                   universidad = sc.next();
                   System.out.print("Ingrese la maestria: ");
                   maestria = sc.next();
                   personas.add(new Magister(nombre,cedula,universidad,maestria));
               }
               break;
               case 3:{
                   System.out.print("Ingreso la cedula: ");
                   cedula = sc.next();
                   System.out.print("Ingrese el nombre: ");
                   nombre = sc.next();
                   System.out.print("Ingrese la universidad: ");
                   universidad = sc.next();
                   System.out.print("Ingrese la materia: ");
                   materia = sc.next();
                   personas.add(new Profesor(nombre,cedula,universidad,materia));
               }
               break;
               case 4:{
                   for(Persona p:personas){
                       System.out.println(p);
                   }
               }break;

           }

       }while(op != 5);

    }
}
