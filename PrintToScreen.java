package com.gordonchoi.printcharset;

/*
Created by Gordon Choi
Website: http://www.gordonchoi.com/
LinkedIn: http://www.linkedln.com/in/gordonchoi
Twitter: https://twitter.com/gordonchoi
Quora: https://www.quora.com/profile/Gordon-Choi
Github: https://github.com/gordonchoi/
 */
/*
This program:
1. Obtains a list of charset names (of character encodings) via the Charset class,
2. and allows writing the charset names alphabetically onto a text file.
An option is given to the user to select a directory and a filename when saving the text file.
The PrintScreen class lets you test what will be written to the text file, by writing to screen.
*/

import java.util.ArrayList;

public class PrintToScreen {
    public static void printScreenArrayList(ArrayList<String> myArrayList){
        System.out.println(myArrayList);
        System.out.println("End - ArrayList");
    }

    public static void printScreenArray(ArrayList<String> myArrayList, String[] myArray){
        for (int i=0;i<myArrayList.size();i++){
            System.out.println(myArray[i]);
        }
        System.out.println("End - Array");
    }
}
