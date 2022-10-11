package Laboratorka3.Task2;

import Laboratorka3.Task1.Check;
import Laboratorka3.Task1.Item;
import Laboratorka3.Task1.Storage;
import java.lang.Exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) throws Exception {
        List<Item> itemsForStorage2 = new ArrayList<>(){{
            add(new Item("Milk",5.0,100));
            add(new Item("Cigarettes",10.5,50));
            add(new Item("Chocolate",3,150));
        }};

        Storage storage2 = new Storage(itemsForStorage2);
        storage2.addNewItem(new Item("Cheese",3.0,20));
        storage2.changeSomethingInItem("Cheese",300);

        //Buyer
        List<Item> itemListPolapa = new ArrayList<>();
        LocalDate localeDatePolapa1 = LocalDate.of(2022,1,1);
        Check checkPolapa = new Check(itemListPolapa, localeDatePolapa1);
        checkPolapa.addNewItemInCheck(storage2,"Gorilka",4);
        checkPolapa.addNewItemInCheck(storage2,"Cigarettes",8);




        System.out.println(storage2);
        System.out.println(checkPolapa);

        storage2.isWord("123");



    }
}
