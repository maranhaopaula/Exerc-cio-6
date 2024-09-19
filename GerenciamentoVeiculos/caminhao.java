package GerenciamentoVeiculos;

public class caminhao {
    private int CapacidadeDeCarga;

    public caminhao(int capacidadeDeCarga) {
        CapacidadeDeCarga = capacidadeDeCarga;
    }
    public int getCapacidadeDeCarga(){
        return CapacidadeDeCarga;
    }
    public void setCapacidadeDeCarga (int capacidadeDeCarga){
        this.CapacidadeDeCarga = capacidadeDeCarga;

    }

}
