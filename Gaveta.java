public class Gaveta {
    private String Gaveta;

    public Gaveta(String gaveta) {
        this.Gaveta = gaveta;
    }

    public String getGaveta() { 
        return Gaveta;
    }

    public void abrir() {
        System.out.println(Gaveta + " acelerando.");
    }
}