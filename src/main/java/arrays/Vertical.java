package main.java.arrays;

public class Vertical {

    public static void main(String[] args){ 
        String [][] stripes = new String [11][11]; 

        for(int x = 0; x < stripes.length; x++){
            for(int y = 0; y < stripes[x].length; y++){
                if(y % 2 == 0){
                    stripes[x][y] = "🐚"; 
                } else 
                    stripes[x][y] = "🦀";
                }
            }
            print2d(stripes); 
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
