
import Animal.*;
import Enclosure.*;
import Food.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Enclosure> enclosures = new ArrayList<>();

    public static void main(String[] args) {
        Enclosure enclosure1 = new EnclosureForCarnivorous(4);
        Enclosure enclosure2 = new EnclosureForCarnivorous(5);
        Enclosure enclosure3 = new EnclosureForHerbivorous(6);
        Enclosure enclosure4 = new EnclosureForHerbivorous(7);

        Main animals = new Main();

        /**
         * Заполняем вольеры
         */

        System.out.println("Первый вольер для плотоядных:");
        for (int i = 0; i < 4; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure1.addAnimal(new Bear());
                    break;
                case 2:
                    enclosure1.addAnimal(new Tiger());
                    break;
                case 3:
                    enclosure1.addAnimal(new Lynx());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }
        }
        animals.addEnclosure(enclosure1);

        System.out.println("--------------------------------");
        System.out.println("Второй вольер для плотоядных");
        for (int i = 0; i < 5; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure2.addAnimal(new Bear());
                    break;
                case 2:
                    enclosure2.addAnimal(new Tiger());
                    break;
                case 3:
                    enclosure2.addAnimal(new Lynx());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure2);
        System.out.println("--------------------------------");
        System.out.println("Третий вольер для травоядных");
        for (int i = 0; i < 6; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure3.addAnimal(new Duck());
                    break;
                case 2:
                    enclosure3.addAnimal(new Horse());
                    break;
                case 3:
                    enclosure3.addAnimal(new Zebra());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure3);

        System.out.println("--------------------------------");
        System.out.println("Третий вольер для травоядных");
        for (int i = 0; i < 7; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure4.addAnimal(new Duck());
                    break;
                case 2:
                    enclosure4.addAnimal(new Horse());
                    break;
                case 3:
                    enclosure4.addAnimal(new Zebra());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure4);

        System.out.println("--------------------------------");
        System.out.println("Кормим животных:");

        for (Enclosure enclosure : animals.getEnclosures()) {
            for (Animal animal : enclosure.getAnimals()) {

                switch ((int) (Math.random() * 4 + 1)) {
                    case 1:
                        animal.eat(new FoodGrass());
                        break;
                    case 2:
                        animal.eat(new FoodMeat());
                        break;
                    case 3:
                        animal.eat(new FoodFish());
                        break;
                    case 4:
                        animal.eat(new FoodHay());
                        break;
                    default:
                        System.out.println("Нет такой еды");
                }
            }

        }

    }

    List<Enclosure> getEnclosures() {
        return enclosures;
    }

    void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }
}
