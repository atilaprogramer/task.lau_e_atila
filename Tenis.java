public abstract class Tenis {
    private String marca;
    private String modelo;
    public Tenis(String marca, String modelo) { 
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(double carga) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void verificarMarca() {
        System.out.println("Marca do tênis: " + marca);
    }
    

    public abstract void calcar(); 
}

