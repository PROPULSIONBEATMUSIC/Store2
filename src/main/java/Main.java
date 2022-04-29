import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Item item1 = new Item(200, true, false, "item_1");
        item1.del();
        item1.add();

        Item item2 = new Item(100, true, true, "item_2");
        item2.add();

        Item item3 = new Item(300, true, false, "item_3");
        item3.add();

        Item item4 = new Item(250, false, false, "item_4");
        item4.add();

        Item item5 = new Item(900, true, true, "item_5");
        item5.add();
        item5.addSuctionCupMan();
//        item5.clearLogs();
    }
}
