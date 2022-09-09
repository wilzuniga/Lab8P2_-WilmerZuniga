
public class SerViv {

    private String Nombre;
    private int ID;
    private int Poder;
    private int Años;
    private String Universo;
    private String Raza;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getAños() {
        return Años;
    }

    public void setAños(int Años) {
        this.Años = Años;
    }

    public String getUniverso() {
        return Universo;
    }

    public void setUniverso(String Universo) {
        this.Universo = Universo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "SerViv{" + "Nombre=" + Nombre + ", ID=" + ID + ", Poder=" + Poder + ", A\u00f1os=" + Años + ", Universo=" + Universo + ", Raza=" + Raza + '}';
    }

    
}
