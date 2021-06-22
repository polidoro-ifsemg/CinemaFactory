package prototype;

import singleton.Compra;

public class EspectadorBuilder {

    private Espectador espectador;

    public EspectadorBuilder() {
        espectador = new Espectador();
    }

    public Espectador build() {
        if(espectador.getIsAdult()){
            espectador.setPreco(15.0);
        }
        else {
            espectador.setPreco(10.0);
        }
        Compra.getInstance().setPreco(espectador.getPreco());
        Compra.getInstance().setNumeroEspectador(1);
        return espectador;
    }}