package GerenciamentoVeiculos;

public class Veiculo {
    private String placa;
    private String modelo;
    private double quilometragem;

    public Veiculo(String placa, String modelo, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
    }
    public String getPlaca(){
        return  placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getModelo(){
        return  modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getQuilometragem(){
        return  quilometragem;
    }
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
}
