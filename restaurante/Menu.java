package restaurante;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Item> itens;

    public Menu(List<Item> itens) {
        this.itens = new ArrayList<>();
    }

    public void inserirItem(Item item){
        this.itens.add(item);


    }
    public void remover(Item item){
        this.remover(item);

    }

}
