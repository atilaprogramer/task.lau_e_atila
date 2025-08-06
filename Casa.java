public class Casa implements Porta, Eletrico {
    private boolean portaAberta;
    private boolean eletricidadeLigada;

    @Override
    public void abrir() {
        portaAberta = true;
        System.out.println("Porta aberta.");
    }

    @Override
    public void fechar() {
        portaAberta = false;
        System.out.println("Porta fechada.");
    }

    @Override
    public boolean estaAberta() {
        return portaAberta;
    }

    @Override
    public void ligarEletricidade() {
        eletricidadeLigada = true;
        System.out.println("Eletricidade ligada.");
    }

    @Override
    public void desligarEletricidade() {
        eletricidadeLigada = false;
        System.out.println("Eletricidade desligada.");
    }
    
}
