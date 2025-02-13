package main.java.arrays;

public class Argyle {

    public static void main(String[] args) {
        String [][] argyle = new String [11][11];

        for(int x = 0; x < argyle.length; x++){
            for(int y = 0; y < argyle[x].length; y++){
                // start by setting shell by default
                argyle[x][y] = "🐚";

                // draw diagonal
                if (x == y) {
                    argyle[x][y] = "🦀";
                }
                if (x + y == argyle.length - 1){
                    argyle[x][y] = "🦀";
                }
            }
        }
        // cross is done - draw diamond
        for(int x = 0; x < argyle.length/2 + 1; x++) {
            argyle[x][argyle.length/2 + x] = "🦀";
            argyle[x][argyle.length/2 - x] = "🦀";

            // lower half
           argyle[argyle.length - 1 - x][argyle.length/2 + x] = "🦀";
           argyle[argyle.length - 1 - x][argyle.length/2 - x] = "🦀";
        }
        print2d(argyle);
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
