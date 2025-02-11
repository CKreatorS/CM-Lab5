package main.java.arrays;

public class Argyle {

    public static void main(String[] args) {
        String [][] ecks = new String [11][11];

        for(int x = 0; x < ecks.length; x++){
            for(int y = 0; y < ecks[x].length; y++){
                if (x == y) {
                    ecks[x][y] = "🦀";
                }
                if (x == y){
                    ecks[x][y] = "🦀";
                }    
                else{
                    ecks[x][y] = "🐚";
                } 
            }
        }
        print2d(ecks);
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
