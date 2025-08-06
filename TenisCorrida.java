public class TenisCorrida extends Tenis {
    private String tipoPisada;

    public TenisCorrida(String marca, String modelo, String tipoPisada) {
        super(marca, modelo);
        this.tipoPisada = tipoPisada;
    }

    @Override
    public void calcar() {
        System.out.println("Calçando tênis de corrida da marca " + getMarca() + " com tipo de pisada: " + tipoPisada);
    }

    @Override
    public void verificarMarca() {
        super.verificarMarca();
        System.out.println("Tipo de pisada: " + tipoPisada);
    }
}


    

