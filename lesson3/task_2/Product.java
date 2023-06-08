package HW.lesson3.task_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Product implements Iterable<Note>{

    public List<Note> products;
    int index;

    public Product() {
        products = new ArrayList<>();
        index = 0;
    }

    public void addProduct(Note product){
        products.add(product);
    }

    public int getSize(){
        int size = products.size();
        return size;
    }
    
}
