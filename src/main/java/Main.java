import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logs logs = new Logs();
        Item item1 = new Item(200, true, false, "item_1");
        logs.del();
        logs.add();

        Item item2 = new Item(100, true, true, "item_2");
        logs.add();

        Item item3 = new Item(300, true, false, "item_3");
        logs.add();

        Item item4 = new Item(250, false, false, "item_4");
        logs.add();

        Item item5 = new Item(900, true, true, "item_5");
        logs.add();
//        logs.addSuctionCupMan();
//        logs.clearLogs();
    }
}
