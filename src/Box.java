import com.sun.deploy.util.JVMParameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.get;

public class Box<T extends Fruit> {

    private List<Fruit> fruits = new ArrayList<>();
    public Box (T... arr){
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(arr));
    }


    public List<Fruit> getFruits() {
        return fruits;
    }

    public boolean addFruit(Fruit fruit) {
        if (fruits.size() == 0) {
            fruits.add(fruit);
            return true;
        } else {
            if ((fruits.get(0) instanceof Apple && fruit instanceof Apple) ||
                    (fruits.get(0) instanceof Orange && fruit instanceof Orange)) {
                fruits.add(fruit);
                return true;
            } else {
                return false;
            }
        }
        //return false;
    }


    public float getWeight() {
        float summ = 0f;
        for (Fruit fruit : fruits) {
            summ += fruit.getWeight();
        }
        return summ;
    }
    public boolean compare(Box box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.01;
    }

    public void transfer(Box<? super T> another){
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
