package com.hiabby.web.interesting.utils;

/**
 * @Author：Arthas
 * @Created：2017/4/26
 */
public class CreateTemp {

    public String createDotmaix(String temp, int row, int num){
        temp = temp.replaceAll("0", ",0");
        temp = temp.replaceAll("1", ",1");


        int column = temp.length() / row;
        System.out.println("result:\n"+temp);

        System.out.println("\nOther Result:");
        System.out.println("-----------------------切割线----------------------");
        String inputTmpDB = "";
        for (int i = 0; i < row; i++){
            System.out.print("{");
            inputTmpDB = inputTmpDB + "&&{";
            for( int j = 0; j < column; j++){
                System.out.print(temp.charAt(i*column + j));
                inputTmpDB = inputTmpDB + temp.charAt(i*column + j);
            }
            System.out.print("},");
            inputTmpDB = inputTmpDB + "},";
            System.out.println();
        }
        System.out.println("-----------------------切割线----------------------");
        return inputTmpDB;
    }
}
