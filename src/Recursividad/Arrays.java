/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author administrador1
 */
public class Arrays {
    private int [] container;
    private int size;

    public int getSize() {
        return size;
    }
    
    public Arrays(int size)
    {
        this.size = size;
        container = new int[size];
        
        Scanner s;
        s = new Scanner(System.in);        
        for (int i = 0; i < size; i++) {
            container[i] = s.nextInt();
        }        
    }
   
    int find(int val, int i)
    {
        if(container[i] == val)
        {
            return i;
        }
        if(i == container.length-1)
        {
            return -1;
        }
        return find(val, i+1);
    }
    
    int binarySearch(int i, int f, int val)
    {
        if(container[i] == val)
        {
            return i;
        }
        if(i == f)
        {
            return -1;
        }
        int temp = (f + i) / 2;        
        if(container[temp] > val)
            return binarySearch(i, temp, val);
        else
            return binarySearch(temp, f, val);
    }
    
    public static void main(String[] args) {
        Arrays a = new Arrays(10);
        int val = 7;
        int pos = a.binarySearch(0, a.getSize(), val);
        System.out.println("numero" + val + " esta en la posición " + pos);
    }
}
