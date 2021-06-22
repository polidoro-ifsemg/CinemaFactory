package prototype;

public class Espectador implements Cloneable {

    private boolean isAdult;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean adult) {
        isAdult = adult;
    }

    public String setServico(String servicoDescription) {
        return servicoDescription;
    }

}