package Laboratorka3.Task1;

public class Item {
    private String name;
    private double price;
    private int amount;

    public Item(String nameItem, double priceItem, int amountItem) {
        this.name = nameItem;
        this.price = priceItem;
        this.amount = amountItem;
    }

    public String getNameItem() {
        return name;
    }

    public void setNameItem(String nameItem) {
        this.name = nameItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                "\nnameItem=" + name + ' ' +
                        ", " + price + "$" +
                        ", " + "value:" + amount;
    }
}
