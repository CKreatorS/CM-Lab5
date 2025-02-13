package main.java.arrays;

public class Argyle {

    public static void main(String[] args) {
        String [][] argyle = new String [11][11];

        for(int x = 0; x < argyle.length; x++){
            for(int y = 0; y < argyle[x].length; y++){
                if (x == y) {
                    argyle[x][y] = "🦀";
                }
                else if (x + y == argyle.length - 1){
                    argyle[x][y] = "🦀";
                }
                else if(x <= argyle.length/2){
                    argyle[x][argyle.length/2 + x] = "🦀";
                    argyle[x][argyle.length/2 - x] = "🦀";
                }
                else {
                    argyle[x][y] = "🐚";
                }
            }
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
