package Laboratorka3.Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Buyer extends Person {
    private List<Check> check;
    private Seller seller;

    public Buyer(String name, List<Check> check, Seller seller) {
        super(name);
        this.check = check;
        this.seller = seller;
    }

    public List<Check> getCheck() {
        return check;
    }

    public void setCheck(List<Check> check) {
        this.check = check;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void spending(LocalDate firstDate, LocalDate secondDate) {
        check.stream()
                .filter(check1 -> check1.getData().isAfter(firstDate)
                        && check1.getData().isBefore(secondDate))
                .forEach(System.out::println);
    }

    public void SumCountProductPerson() {
        System.out.println(check.stream()
                .mapToInt(check1 -> check1.getCheckList()
                        .stream().mapToInt(Item::getAmount)
                        .sum()).sum());
    }


    @Override
    public String toString() {
        return "Check=" + check +
                "\nSeller=" + seller;
    }
}
