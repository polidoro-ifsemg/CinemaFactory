package singleton;

public class Compra {
    private static Compra instance = new Compra();

    public Compra() {
    }

    public static Compra getInstance() {
        return instance;
    }

    private Integer numeroEspectador = 0;
    private String filmeNome;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preço) {
        this.preco += preço;
    }

    public Integer getNumeroEspectador() {
        return numeroEspectador;
    }

    public Integer setNovoEspectador() {
        return numeroEspectador + 1;
    }

    public void setNumeroEspectador(Integer numeroEspectador) {
        this.numeroEspectador += numeroEspectador;

        
    }

    public String setServico(String servicoDescription) {
        return "";
    }

    public String getRecibo() {
        return "Espectadores: " + getNumeroEspectador() + "\n " + "Preço total: " + getPreco();
    }

}
