package com.alkaraawy;

import java.util.ArrayList;

public class Sudoku2 {

    public static boolean sudoku(char[][] grid) {
        ArrayList<Character> arrayColumn = new ArrayList<Character>();
        ArrayList<Character> arrayRow = new ArrayList<Character>();
        ArrayList<Character> arrayBlock = new ArrayList<Character>();
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++)
            {
                char x=grid[i][j];
                if(x=='.'){

                    continue;

                }
                else {
                    if (arrayRow.contains(x)){
                        System.out.println(i+"false");
                        return false;

                    }
                    else
                        arrayRow.add(x);
                }

            }
            System.out.println("Row"+arrayRow);

            arrayRow.clear();

        }



        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++)
            {
                char y=grid[j][i];


                if (y=='.'){

                    continue;
                }
                else {
                    if(arrayColumn.contains(y)){
                        System.out.println(i+"false");
                        return false;
                    }else
                        arrayColumn.add(y);
                }



            }

            System.out.println("cloumn"+i+"="+arrayColumn);
            arrayColumn.clear();
        }


        for (int i = 0; i < grid.length; i+=3) {
            for (int j = 0; j <grid.length ; j+=3) {

                for (int k = i; k < (i + 3); k++) {

                    for (int l = j ;l <(j+3) ; l++) {

                        char z=grid[k][l];

                        if(z=='.'){

                            continue;

                        }else
                        {
                            if (arrayBlock.contains(z)){

                                System.out.println(k +" "+ l);
                                System.out.println(z);
                                return false;
                            }
                            else
                                arrayBlock.add(z);

                        }







                    }


                }


                System.out.println(arrayBlock);
                arrayBlock.clear();



            }

        }

        return true;
    }

}
