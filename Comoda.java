
public class Comoda extends Gaveta {
    private String local;

    public Comoda(String Gaveta) {
        super(Gaveta);
    }

    public String getComoda() {
        return super.getGaveta();
    }

    @Override
    public void abrir() {
        System.out.println(getComoda() + " acelerando rapidamente."); 
    }
}
    
