package personas;

public class Magister extends Alumno{

    private String maestria;
    public Magister(String nombre, String cedula, String universidad, String maestria) {
        super(nombre, cedula, universidad);
        this.maestria = maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public String getMaestria() {
        return maestria;
    }
    @Override
    public String toString() {
        return "nombre: " + getNombre() +
                "\ncedula: " + getCedula() +
                "\nuniversidad: " + getUniversidad() +
                "\nmaestria: " + maestria;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("maestria: "+maestria);
    }
}
