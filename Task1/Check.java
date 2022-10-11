package Laboratorka3.Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Check {
        private List<Item> checkList;
        private LocalDate data;


        public Check(final List<Item> checkList, final LocalDate data) {
                this.checkList = checkList;
                this.data = data;
        }

        public Check(final Check copyCheckList){
                this.checkList = copyCheckList.checkList;
        }



        public List<Item> getCheckList() {
                return checkList;
        }

        public void setCheckList(final List<Item> checkList) {
                this.checkList = checkList;
        }

        public LocalDate getData() {
                return data;
        }

        public void setData(final LocalDate data) {
                this.data = data;
        }

        public void addNewItemInCheck(final Storage storage, final String nameItem, final int amountItem){
                for(Item item: storage.getStorage()){
                        if(item.getNameItem().equals(nameItem)){
                                Item temp = new Item(nameItem,item.getPrice(),amountItem);
                                checkList.add(temp);
                                storage.buySomethingItem(storage,nameItem,amountItem);
                        }
                }
        }

        public double profit(){
                double profit = 0;
                for(Item check: checkList){
                        profit += check.getPrice() * check.getAmount();
                }
                return profit;
        }

        @Override
        public String toString() {
                return "checkList=" + checkList +
                        " data=" + data + "\n";
        }
}
