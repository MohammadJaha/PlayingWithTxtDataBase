/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprojectfile;

/**
 *
 * @author miro_
 */
// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
//--------------------------------------------------------------
class ArraySel
{
    private double[] a; // ref to array a
    private int nElems; // number of data items
//--------------------------------------------------------------
    public ArraySel(int max) // constructor
    {
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }
//--------------------------------------------------------------
    public void insert(double value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }
//--------------------------------------------------------------
    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
        System.out.print(a[j] + "   "); // display it
        System.out.println("");
    }
//--------------------------------------------------------------
    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) // outer loop
        {
            min = out; // minimum
            for(in=out+1; in<nElems; in++) // inner loop
                if(a[in] < a[min] ) // if min greater,
                    min = in; // we have a new min
            swap(out, min); // swap them
        } // end for(outer)
    } // end selectionSort()
//--------------------------------------------------------------
    private void swap(int one, int two)
    {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
//--------------------------------------------------------------
} // end class ArraySel