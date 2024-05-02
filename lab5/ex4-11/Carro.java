public class Carro extends VeiculoTerrestre {
    private class Motor {
        String modelo;

        public void liga() {
        }
    }

    private Motor meuMotor;
    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
        meuMotor = new Motor();
    }

    @Override
    public void liga() {
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Carro)");
    }
}