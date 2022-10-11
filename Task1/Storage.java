package Laboratorka3.Task1;

import java.util.*;
import java.util.regex.Pattern;

public class Storage {
    private List<Item> storage;

    public Storage(List<Item> storage) {
        this.storage = storage;
    }

    public List<Item> getStorage() {
        return storage;
    }

    public void setStorage(List<Item> storage) {
        this.storage = storage;
    }

    public void addNewItem(Item addNewItem) throws Exception {
        if (addNewItem.getNameItem().isEmpty() || addNewItem.getNameItem().equals(" ")) {
            throw new Exception("Field 'Name' is empty");
        } else this.storage.add(addNewItem);
    }


    public void isWord(String in) {
        boolean check = Pattern.matches("[a-zA-Z]+", in);
        if (check) {
            System.out.println("Valid name");
        } else System.out.println("Invalid name");
    }


    public void changeSomethingInItem(final String nameChangeItem, final int changeAmountItem) {
        for (Item stor : this.getStorage()) {
            if (stor.getNameItem().equals(nameChangeItem)) {
                stor.setAmount(changeAmountItem);
            }
        }
    }

    public void changeSomethingInItem(final String nameChangeItem, final double itemNewPrice) {
        for (Item stor : this.getStorage()) {
            if (stor.getNameItem().equals(nameChangeItem)) {
                stor.setPrice(itemNewPrice);
            }
        }
    }


    public void buySomethingItem(final Storage storage, final String nameChangeItem, final int ValueTakeItem) {
        for (Item stor : storage.getStorage()) {
            if (stor.getNameItem().equals(nameChangeItem)) {
                stor.setAmount(stor.getAmount() - ValueTakeItem);
            }
        }
    }

    public void sortItemForNameOnStorage() {
        setStorage(storage.stream().sorted(Comparator.comparing(Item::toString)).toList());
    }

    public List<Item> filterItemPerPrice(final double firstPrice, final double secondPrice) {
        List<Item> filterListItem = new ArrayList<>();
        storage.stream()
                .filter(item -> item.getPrice() > firstPrice && item.getPrice() < secondPrice)
                .forEach(filterListItem::add);

        return filterListItem;
    }

    public double meanPrice() {
        return  storage.stream()
                .mapToDouble(Item::getPrice)
                .average()
                .orElse(Double.NaN);
    }



    @Override
    public String toString() {
        return "Storage=\n" + storage + "\n......";
    }
}
