package Laboratorka3.Task1;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws Exception {
        List<Item> itemsForStorage1 = new ArrayList<>(){{
            add(new Item("Milk",5.0,100));
            add(new Item("Cigarettes",10.5,50));
            add(new Item("Chocolate",3,150));
        }};

        Storage storage1 = new Storage(itemsForStorage1);
        storage1.addNewItem(new Item("Cheese",3.0,20));
        storage1.changeSomethingInItem("Cheese",300);

        //Buyer
        List<Item> itemListPolapa1 = new ArrayList<>();
        List<Item> itemListPolapa2 = new ArrayList<>();
        LocalDate localeDatePolapa1 = LocalDate.of(2022,2,2);
        LocalDate localeDatePolapa2 = LocalDate.of(2022,1,1);

        Check checkPolapa1 = new Check(itemListPolapa1,localeDatePolapa1);
        Check checkPolapa2 = new Check(itemListPolapa2, localeDatePolapa2);
        checkPolapa1.addNewItemInCheck(storage1,"Cheese",5);
        checkPolapa1.addNewItemInCheck(storage1,"Cigarettes",8);
        checkPolapa1.addNewItemInCheck(storage1,"Cake",5);
        checkPolapa1.addNewItemInCheck(storage1,"Borch",8);

        List<Check> Polapa= new ArrayList<>();
        Polapa.add(checkPolapa1);
        Polapa.add(checkPolapa2);


        Buyer buyerPolapa = new Buyer("Polapa",Polapa,new Seller("Nyra",100.0));




        System.out.println(storage1);
        System.out.println(buyerPolapa);

    }
}
