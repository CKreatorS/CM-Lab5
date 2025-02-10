package main.java.arrays;

public class Diagonal {

    public static void main(String[] args) {
        String [][] slants = new String [11][11]; 

        for(int x = 0; x < slants.length; x++){
            if (x % 2 == 0) {
                [x][y] = "🦀";
            }
            for(int y = 0; y < slants[x].length; y++){
                if (y % 1 == 0) {
                    [x][y] = "🐚";
                }
            }
        }
        print2d(slants);
    }
}

    public static void print2d(String[][] array){

        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                System.out.print(array[x][y]); 
            }
            System.out.println(); 
        }
    }
}
