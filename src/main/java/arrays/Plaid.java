package main.java.arrays;

public class Plaid {
    public static void main(String[] args) {
        String [][] pajamas = new String [11][11]; 

        for(int x = 0; x < pajamas.length; x++){
            for(int y = 0; y < pajamas[x].length; y++){
                if(x % 2 == 0 && y % 2 == 0) {
                    pajamas[x][y] = "🦀"; 
                } else {
                    pajamas[x][y] = "🐚";
                }
            }
        }
        print2d(pajamas);
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
