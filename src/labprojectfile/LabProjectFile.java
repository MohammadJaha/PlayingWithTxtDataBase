/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprojectfile;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mohammad_Jaha
 */
public class LabProjectFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception
    {
    int maxSize = 100; // array size
    ArraySel arr; // reference to array
    arr = new ArraySel(maxSize); // create the array
    PrintWriter d;
    File F=new File("Lap Test.txt");
    if(!F.exists()){
        d=new PrintWriter (F);
        System.out.println(F.getAbsolutePath());
        d.close();
    }
    Scanner M=new Scanner (F);
    for(;M.hasNext();)
        arr.insert(M.nextDouble());
    M.close();
    System.out.println("The Numbers in The File Are :");
    arr.display(); // display items
    arr.selectionSort(); // selection-sort them
    System.out.println("The Numbers After Sorting Are:");
    arr.display(); // display them again
    } // end main()
} // end class SelectSortApp


