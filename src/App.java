public class App {
    public static void main(String[] args) {
        int data[][] = new int[5][5];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j) {
                    data[i][j] = 0;
                    System.out.print(data[i][j]);
                } else {
                    data[i][j] = 1;
                    System.out.print(data[i][j]);
                }
            }
            System.out.println();
        }
    }
}
