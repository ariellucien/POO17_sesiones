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
public class BinaryTree {
    private Node root = null;
    private Node temp = null;
    
    
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
            temp = root;
        }
        else
        {
            if(value < temp.getValue())
            { //cuando el número a insertar es menor
                if(temp.left == null)
                {
                    Node n = new Node();
                    n.setValue(value);
                    temp.left = n;
                    return;
                }
                else
                {
                  temp = temp.left;
                  insert(value);
                }
            }
            else
            {// cuando el número a insertar es mayor
                if(temp.right == null)
                {
                    Node n = new Node();
                    n.setValue(value);
                    temp.right = n;
                    return;
                }
                else
                {
                    temp = temp.right;
                    insert(value);
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
        BinaryTree dt = new BinaryTree();
        dt.insert(10);
        dt.insert(8);
        dt.insert(17);
        dt.insert(4);
        dt.insert(9);
        dt.insert(3);
        dt.insert(2);
        dt.printTree();
    }
}
