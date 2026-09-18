


public interface Loop {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before loop starts");

        while (x <= 5) {
            System.out.println("The value of x is: "+ x);
            x += 1;
        }

        // enhanced for loop 
        String[] names = {"hruthikesh", "syed", "palak", "khushi"};
        for (String n: names) {
            System.out.println(n);
        }
        
    }
}
