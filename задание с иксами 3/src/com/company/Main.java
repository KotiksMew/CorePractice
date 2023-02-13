package com.company;

public class Main {

    public static void main(String[] args) {
	int b=7;
	int[][] array= new int[b][b];

	for(int i=0; i< array.length;i++){
	    for(int j=0; j< array.length; j++){
	        if(i==b-2) array[i][j]=1;
	        if((b-2==j+i)&i>0) array[i][j]=1;
            if((i==j-1)&i>0) array[i][j]=1;
        }
    }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
    }
}
