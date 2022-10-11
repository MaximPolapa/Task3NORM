package Laboratorka3.Task1;

import java.util.Comparator;
import java.util.List;

public class History {
    private List<Check> listCheck;

    public History(List<Check> listCheck) {
        this.listCheck = listCheck;
    }

    public List<Check> getListCheck() {
        return listCheck;
    }

    public void setListCheck(List<Check> listCheck) {
        this.listCheck = listCheck;
    }

    public void addNewCheckInHistory(Check chek){
        listCheck.add(chek);
    }

    public void mostPopularItem(){
        System.out.println(listCheck.stream()
                .map(listCheck -> listCheck.getCheckList().stream()
                        .max(Comparator.comparingInt(Item::getAmount))).toList());
    }

    public void theBiggestProfitDay(){
        System.out.println(listCheck.stream()
                .max(Comparator.comparingDouble(Check::profit)));
    }

    @Override
    public String toString() {
        return "History{" +
                "listCheck=" + listCheck +
                '}';
    }
}
