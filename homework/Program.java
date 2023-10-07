package geekbrains.lesson1.sample4.homework;

import geekbrains.lesson1.Chocolate;
import geekbrains.lesson1.Product;
import geekbrains.lesson1.sample4.homework.Apple;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {
        ArrayList<Apple> apples1 = new ArrayList<Apple>();
        for(int i = 0; i < 21; i++)
            apples1.add(new Apple ());
        Box<Apple> appleBox = new Box<>(apples1);
        ArrayList<Apple> apples2 = new ArrayList<Apple>();
        for(int i = 0; i < 25; i++)
            apples2.add(new Apple ());
        Box<Apple> appleBox2 = new Box<>(apples2);
        ArrayList<Orange> oranges = new ArrayList<Orange>();
        for(int i = 0; i < 14; i++)
            oranges.add(new Orange ());
        Box<Orange> orageBox = new Box<>(oranges);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(orageBox.getWeight());
        System.out.println(appleBox.compare(orageBox));
        orageBox.add(new Orange());
        System.out.println(orageBox.getWeight());
        appleBox2.pourOver(appleBox);
        System.out.println(appleBox.getWeight());

    }
}

