package geekbrains.lesson1.sample4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    private float quantity;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        this.quantity = fruits.size();

    }

    public float getWeight() {
        if (quantity > 0)
            return quantity * fruits.get(0).getWeight();
        else
            return 0;
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) return true;
        else return false;

    }

    public void add(T fruit) {
        fruits.add(fruit);
        quantity += 1;

    }
    public void pourOver(Box<T> box){
        for (T fruit : fruits) box.add(fruit);
        fruits.clear();
        quantity = 0;

    }


}
