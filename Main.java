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

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> myArrayList = new ArrayList<String>();
        Map<String, Charset> charsets = Charset.availableCharsets();

        // Get the charset names & import to ArrayList
        for (String nameCharset : charsets.keySet()){
            myArrayList.add(nameCharset);
        }

        // Convert ArrayList to Array
        String myArray[] = new String[myArrayList.size()];
        myArray = myArrayList.toArray(myArray);

        // (Test) Print ArrayList
        //PrintToScreen.printScreenArrayList(myArrayList);

        // (Test) Print Array
        //PrintToScreen.printScreenArray(myArrayList, myArray);

        // Save the file (*.txt) in a directory & a filename of your choice
        SaveFile.saveFilename(myArrayList, myArray);
    }
}
