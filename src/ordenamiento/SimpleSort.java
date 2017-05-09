/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author administrador1
 */
public class SimpleSort {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        
        lista.add(new Integer(5));
        lista.add(new Integer(4));
        lista.add(new Integer(3));
        lista.add(new Integer(2));
        lista.add(new Integer(1));
        
        for(Iterator i = lista.iterator(); i.hasNext(); )
        {
            System.out.println("value: "+i.next());
        }
        
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.intValue() > o2.intValue())
                {
                    return -1;
                }
                else
                {
                    if(o1.intValue() < o2.intValue())
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        });
        
        
        
        System.out.println("Elementos ordenados: ");
        for(Iterator i = lista.iterator(); i.hasNext(); )
        {
            System.out.println("value: "+i.next());
        }
        
    }
}
