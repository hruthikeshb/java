import java.util.Date;

public class Formatting {
    public static void main(String[] args) {

        /* To just get a timestamp "NOW" use Date() but for everything else use Calendar() */
        // Formatting numbers 
        int number = 10000000;
        String s = String.format("%, d", number);
        System.out.println(s);
        
        System.out.printf("I have %.2f bugs to fix\n", 497978.05623899);
        System.out.printf("I have %, .2f bugs to fix\n", 497978.05623899);

        System.out.printf("%, 6.1f\n", 425896.234889);


        // Formatting Dates 
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today, today, today));



    }
    
}
