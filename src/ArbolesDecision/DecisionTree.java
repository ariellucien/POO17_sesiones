/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesDecision;

/**
 *
 * @author administrador1
 */
public class DecisionTree {
    private Node root = null;
    
    void insert(int value)
    {
        // caso 1 - no existe ningún nodo
        if (root == null)
        {
            //crear instancia de root
            root = new Node();
            //su hijo izquierdo y derecho son null
            root.setLeft(null);
            root.setRight(null);
            //asignar valor
            root.setValue(value);            
        }
        else
        {
            if(value < root.getValue())
            { //cuando el número a insertar es menor
                if(root.left == null)
                {
                    Node n = new Node();
                    n.setValue(value);
                    root.left = n;
                }
                else
                {
                    
                }
            }
            else
            {// cuando el número a insertar es mayor
                if(root.right == null)
                {
                    Node n = new Node();
                    n.setValue(value);
                    root.right = n;
                }
                else
                {
                    
                }
            }
        }
    }
    
    void printTree()
    {
        if(root == null)
        {
            System.out.println("El árbol está vacío");
        }
        else
        {
            root.print();
        }
    }
    
    public static void main(String[] args) {
        DecisionTree dt = new DecisionTree();
        //dt.insert(8);
        dt.printTree();
    }
}
