package main.java.arrays;

public class Solidrug {

    public static void main(String[] args){ 
        String [][] plain = new String [11][11]; 

        for(int x = 0; x < plain.length; x++){
            for(int y = 0; y < plain[x].length; y++){
                plain[x][y] = "🦀";
            }
        }
        print2d(plain); 
    }
    

    public static void print2d(String[][] array){

        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                System.out.print(array[x][y]); 
            }
        }
        System.out.println(); 
    }
}
