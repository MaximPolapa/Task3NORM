package Laboratorka3.Task3;

import Laboratorka3.Task1.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(final String[] args) throws Exception {
        final List<Item> itemsForStorage1 = new ArrayList<>() {{
            add(new Item("Milk", 5.0, 100));
            add(new Item("Cigarettes", 10.5, 50));
            add(new Item("Chocolate", 3, 150));
        }};

        final Storage storage1 = new Storage(itemsForStorage1);
        storage1.addNewItem(new Item("Cheese", 3.0, 20));
        storage1.changeSomethingInItem("Cheese", 300);

        //Buyer
        final List<Item> itemListPolapa1 = new ArrayList<>();
        final List<Item> itemListPolapa2 = new ArrayList<>();
        final LocalDate localeDatePolapa1 = LocalDate.of(2022, 4, 5);
        final LocalDate localeDatePolapa2 = LocalDate.of(2022, 1, 4);

        final LocalDate test1 = LocalDate.of(2023, 4, 5);
        final LocalDate test2 = LocalDate.of(2024, 4, 5);


        final Check checkPolapa1 = new Check(itemListPolapa1, localeDatePolapa1);
        final Check checkPolapa2 = new Check(itemListPolapa2, localeDatePolapa2);
        checkPolapa1.addNewItemInCheck(storage1, "Cheese", 20);
        checkPolapa1.addNewItemInCheck(storage1, "Cigarettes", 7);
        checkPolapa1.addNewItemInCheck(storage1, "Cake", 5);//Error, no cake in storage

        checkPolapa2.addNewItemInCheck(storage1,"Cigarettes",30);

        final List<Check> Polapa = new ArrayList<>();
        Polapa.add(checkPolapa1);
        Polapa.add(checkPolapa2);


        final Buyer buyerPolapa = new Buyer("Polapa", Polapa, new Seller("Nyra", 100.0));

        History allHistory = new History(new ArrayList<>());
        allHistory.addNewCheckInHistory(checkPolapa1);
        allHistory.addNewCheckInHistory(checkPolapa2);

        //System.out.println(allHistory);
        //allHistory.mostPopularItem();

        //storage1.sortItemForNameOnStorage();
        //System.out.println(storage1.filterItemPerPrice(4.0,11));
        //System.out.println(storage1);
        //System.out.println(storage1.meanPrice());
        //buyerPolapa.spending(test1,test2);
        //buyerPolapa.SumCountProductPerson();

        allHistory.theBiggestProfitDay();
        //System.out.println(checkPolapa1);
    }
}
