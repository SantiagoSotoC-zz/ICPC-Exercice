package Minesweeper;

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ret="";
        
        while (in.hasNextLine()) {
            int r = in.nextInt();
            int c = in.nextInt();
      

            if(r==0 && c ==0){
               break;
            }
            
            in.next();
            String [][] mat = new String [r][c];
            String [][] aux = new String [r][c];
            for (int i = 0; i < mat.length; i++) {
              String [] linea = in.nextLine().split("");
              mat[i]= linea;
            }
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    int suma=0;
                    if(!mat[i][j].equals("*")){
                        try{
                        if(mat[i-1][j].equals("*")){
                            suma++;
                        }
                        }catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i+1][j].equals("*")){
                           suma++; 
                        }
                        }catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i][j-1].equals("*")){
                           suma++; 
                        }}catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i][j+1].equals("*")){ 
                            suma++;
                        }}catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i-1][j-1].equals("*")){
                            suma++;
                        }}catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i-1][j+1].equals("*")){
                            suma++;
                        }}catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i+1][j-1].equals("*")){
                            suma++;
                        }}catch(Exception ex){
                            
                        }
                        try{
                        if(mat[i+1][j+1].equals("*")){
                            suma++;
                        }
                        }catch(Exception ex){
                            
                        }
                        aux[i][j]=suma+"";
                    }else{
                        aux[i][j] = "*";
                    }
                    
                }
            }
            
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[i].length; j++) {
                   ret+= aux[i][j]; 
                }
               ret += "\n";
            }
            
        }
        System.out.println(ret);
    }
}
