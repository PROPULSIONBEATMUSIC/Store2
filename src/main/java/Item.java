import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Item{
    static int item_id;
    static int cost;
    static boolean instock;
    static boolean cardpayment;
    static String name;

    public enum Type{
        NAME,
        COST,
        MESSAGE,
        CARD
    }
    public Item(int cost, boolean instock, boolean cardpayment, String name) {
        this.cost = cost;
        this.instock = instock;
        this.cardpayment = cardpayment;
        this.name = name;
    }

    public int getItem_id() {
        return item_id++;
    }

    public int getCost() {
        return cost;
    }

    public boolean isInstock() {
        return instock;
    }

    public boolean isCardpayment() {
        return cardpayment;
    }

    public String getName() {
        return name;
    }


    public void add() throws IOException {
        String addItem = "INSERT store(item_id, cost, instock, cardpayment, name) VALUES ("+getItem_id()+", "+getCost()+", "+isInstock()+", "+isCardpayment()+", '"+getName()+"') ";

        File file = new File("src/main/java/logs/logs");
        FileWriter writer = new FileWriter(file, true);
        if(file.exists()){
            writer.write("DATA: " + LocalDateTime.now() + " STREAM: " + Thread.currentThread() + " NAME: " + (getName()) + " COST: " + (getCost()) + " CARD: " + (isCardpayment()) + " MESSAGE: " + "12345anime" + "\n");
        }
        writer.close();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/store?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
            String username = "root";
            String password = "1111";

            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int add = statement.executeUpdate(addItem);
                System.out.println("Добавлено " + add);
            }
        }
        catch (Exception ex){
            System.out.println("ADD ERROR");
            System.out.println(ex);
        }
    }
    public void del(){
        String delItem = "DELETE FROM store";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/store?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
            String username = "root";
            String password = "1111";

            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int del = statement.executeUpdate(delItem);
                System.out.println("Удалено " + del);
            }
        }
        catch (Exception ex){
            System.out.println("DEL ERROR");
            System.out.println(ex);
        }
    }
    public void clearLogs() throws IOException {
        new FileWriter("src/main/java/logs/logs", false).close();
    }
    public void addSuctionCupMan() throws IOException {
        File file = new File("src/main/java/logs/logs");
        FileWriter writer = new FileWriter(file, true);
        if(file.exists()){
            writer.write("\n" +

                    "                                       ,▄██▓████████▄▄\n" +
                    "                                      Æ▓████████████████▄,\n" +
                    "                                   ,╓╣▀▀███████████████████▄\n" +
                    "                                   ▓▓▓▓▓▓██▓███████▓████████\n" +
                    "     HEY! I'm climbing your logs! ▐██████▀██████████████████▌\n" +
                    "                                   ▀█      y████████████████Γ\n" +
                    "                                   Γ       ▐ ▀▀████████████▀\n" +
                    "                                       `  ▒▌ ░███████████▌\n" +
                    "                                  ƒV  ,⌐w╜' ░╟███████████\n" +
                    "        ▄▄█████████▄▄               Å╜\"\"*   ▒█▓█████████\n" +
                    "     ╓██▓▓█████████████▄           `  ▀███  ▒▓█████████▌\n" +
                    "   ,██▓▓█████████████████              ▐██.░███████████\n" +
                    "  ,██▓████████████████████           \"╙▀██▌░██████████▌\n" +
                    "  ██▓▓████████▀▀▀▓████████▌         Aⁿⁿ╨▄▀▌ ▐███████████    ,,,,\n" +
                    "  ██▓█████████▄'`▀▀╢▓██████          \"═[  ▄████████▌▀▀▀,▄████▓██████▄\n" +
                    "  ██▓█████████▌   '╫███████       ███████████████████▄██▓▓█████████████▄\n" +
                    "  ▐██▓████████▌ ,  ╟▀█████      ,╗╢▓▓▓████████████████▓██████████████████\n" +
                    "   ▀██████████████ \"╟▀███     ╓╣▓▓▓▓▓▓████████████████████████████████████\n" +
                    "     ▀██▓██████████  ║▐█   ,╗▓▓▓▓████▓████████████████████████████▀▀██████▌\n" +
                    "       \"▀███████████  ╠╢▄▓▓▓▓▓▓███▓██████████████████████████▌   ,╢▒███████\n" +
                    "             '`        ╙█▓▓████▓█▓▓█▓███████████████▓█████▀▀`,╓p▓▓▐███████▌\n" +
                    "                      , ▐▓████ ▀▓▓▓█████████████████▓▀▀ ,╓p▒▄███▄▄████████\n" +
                    "                       '*▀▀▀   ░█▓▓████████████████▌╓@@▒████████████████▀\n" +
                    "                               ▌█▓▓█████████████████╩▀██▓██████████████`\n" +
                    "                               █▒▓▓█████████████████    ▀██████████▀▀\n" +
                    "                               ██▄▓▓████████████████\n" +
                    "                                ███████████████████\n" +
                    "                              ,,▄█████████████████▌\n" +
                    "                   ,,╓▄▄&██████████████████████████\n" +
                    "                 ▐╢▓█████████████████▀▀\"\"▀▀███████▌\n" +
                    "                 ▐╣▓████████▀▀▀`            ▓██████\n" +
                    "                  ▀▓██████⌐                 ▐▓█████▌\n" +
                    "                  ,█▓██████▄▄                ▐██████\n" +
                    "               ╓███▓█▓█████████▄,             ▓██████\n" +
                    "             ,██▓▓██▓█▓███████████             ▓█████▄\n" +
                    "            ▄█▌▓▓████▀█▓███████████             ▓█████▄\n" +
                    "            █▌▓▓████▌▓▓█████████████            ╙██████▄\n" +
                    "           ▐█▓▓▓████████████████████r            ▀██████▄\n" +
                    "           ▐█▓▓█████████████████████           ,▄███████████▄,\n" +
                    "            ██▓▓████████████████████         ▄██▓▓▓████████████▄\n" +
                    "             ██▓███████████████████        ,██▓▓▓████████████████,\n" +
                    "              ▀█▓████████████████▀         ██▓▓████▒▓█████████████\n" +
                    "                ▀█████████████▀▀          ██▓▓█████▓███████████████\n" +
                    "                    ▀▀▀▀▀▀▀▀              ██▓██████████████████████\n" +
                    "                                          █████████████████████████\n" +
                    "                                           ███████████████████████\n" +
                    "                                            ██▓██████████████████\"\n" +
                    "                                             ▀██▓██████████████▀\n" +
                    "                                                ▀▀██████████▀\n" +
                    " ");
        }
        writer.close();
    }
}
