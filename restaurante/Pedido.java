package restaurante;

import  java.util.List;

public class Pedido {
    private  String numeroPedido;
    private  String data;
    private  List<Item> itens;
    private double valorTotal;

    public Pedido(String numeroPedido, String data, List<Item> itens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
    public void inserirItemPedido(Item item){
        this.itens.add(item);
        valorTotal+=item.getPreco();
}

    public void removerItemPedido(Item item){
        this.itens.remove(item);
    }

    public void setValorTotal(){
        double total = 0;
        for(int i = 0; i<itens.size(); i++){
            total+=itens.get(i).getPreco();
        }
        this.valorTotal = total;

    }

}
