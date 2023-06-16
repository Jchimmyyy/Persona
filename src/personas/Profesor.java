package personas;

public class Profesor extends Persona{

    private String universidad;
    private String materia;

    public Profesor(String nombre, String cedula, String universidad, String materia) {
        super(nombre, cedula);
        this.universidad = universidad;
        this.materia = materia;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getMateria() {
        return materia;
    }
     @Override
    public String toString() {
        return "nombre: " + getNombre() +
                "\ncedula: " + getCedula()+
                "\nuniversidd: "+universidad+
                "\nmateria: "+materia;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("universidd: "+universidad+
                "\nmateria: "+materia);
    }
}
