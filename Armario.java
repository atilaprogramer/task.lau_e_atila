public class Armario extends Gaveta{
    private String portas;

    public Armario(String Gaveta) {
        super(Gaveta);
    }  
    public String getArmario() {
        return super.getGaveta();
    }

    @Override
    public void abrir() {
        System.out.println(getArmario() + " acelerando com potência.");
    }
}
