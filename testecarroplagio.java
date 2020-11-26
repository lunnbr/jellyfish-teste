public class Carro {

    private String modelo;
    private String potencia;
    private double carroceria;
    private boolean ligado;

    public Carro(String modelo, String potencia, double carroceria) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.carroceria = carroceria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public double getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(double carroceria) {
        this.carroceria = carroceria;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Carroceria: " + this.Carroceria);
    }

    public void manobrar() {
        if (this.ligado == true) {
            System.out.println("Posso dirigir pois está ligado");
        } else {
            System.out.println("Posso dirigir");
        }

    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }