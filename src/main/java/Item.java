public class Item {
    static int item_id;
    static int cost;
    static boolean instock;
    static boolean cardpayment;
    static String name;

    public Item(int cost, boolean instock, boolean cardpayment, String name) {
        this.cost = cost;
        this.instock = instock;
        this.cardpayment = cardpayment;
        this.name = name;
    }

    public static int getItem_id() {
        return item_id++;
    }

    public static int getCost() {
        return cost;
    }

    public static boolean isInstock() {
        return instock;
    }

    public static boolean isCardpayment() {
        return cardpayment;
    }

    public static String getName() {
        return name;
    }

}
