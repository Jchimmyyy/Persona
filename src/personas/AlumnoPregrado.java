package personas;

public class AlumnoPregrado extends Alumno{
    private String carrera;

    public AlumnoPregrado(String nombre, String cedula, String universidad, String carrera) {
        super(nombre, cedula, universidad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
     @Override
    public String toString() {
        return "nombre: " + getNombre() +
                "\ncedula: " + getCedula() +
                "\nuniversidad: " + getUniversidad() +
                "\ncarrera: " + carrera;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("carrera: "+carrera);
    }
}
