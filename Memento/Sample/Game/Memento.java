package Game;
import java.util.*;

public class Memento {
    int money;                              
    ArrayList<String> fruits;                      
    public int getMoney() {                 
        return money;
    }
    Memento(int money) {                   
        this.money = money;
        this.fruits = new ArrayList<String>();
    }
    void addFruit(String fruit) {           
        fruits.add(fruit);
    }
    List<String> getFruits() {                   
         return (List<String>)fruits.clone();
    }
}
