package Animal;

import Food.*;

public abstract class Herbivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(name + " ест " + food);
        } else {
            System.out.println(name + " не может есть " + food);
        }
    }
}

