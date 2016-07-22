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

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class SaveFile {

    public static void saveFilename(ArrayList<String> myArrayList, String[] myArray){
        // Create the Save File dialog
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Choose a directory to save your file");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(fc.showSaveDialog(frame) != JFileChooser.CANCEL_OPTION){
            File f = fc.getSelectedFile();
            try{
                // Construct the chosen directory and the filename
                BufferedWriter output = new BufferedWriter(new FileWriter(f.getAbsolutePath() + ".txt"));
                // Write Array to File
                for (int i=0;i<myArrayList.size();i++){
                    output.write(myArray[i] + "\n");
                }
                output.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error saving file");
            }
        }
        frame.dispose();
    }

}
