public class Onibus extends VeiculoTerrestre {
    private class Motor {
        String modelo;

        public void liga() {
        }
    }

    private Motor meuMotor;

    public Onibus(String modelo) {
        this.modelo = modelo;
        meuMotor = new Motor();
    }

    @Override
    public void liga() {
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Vrum vrum!)");
    }

    @Override
    public void desliga() {
        System.out.println(modelo + " desligado! (Ônibus terrestre voador ultra sonico 2000 exe 4K)");
    }

}