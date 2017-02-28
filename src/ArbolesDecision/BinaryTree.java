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
    private Node root = null; // la raíz del árbol
    private Node temp = null; //permite movernos en el árbol
    
    
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
    
    int find(int value, int cont)
    {
        if(cont == 0)
        {
            temp = root;
            cont++;
        }
        if(temp == null)
        {
            return -1;
        }
        if(value == temp.getValue())
        {
            return value;
        }
        if(value < temp.getValue())
        {
            temp = temp.left;
            if(temp == null)
            {
                return -1;
            }                        
        }
        else            
        {        
            temp = temp.right;
            if(temp == null)
            {
                return -1;
            }            
        }
        return find(value, 1);
    }
    
    void inOrder(int cont)
    {
        if(cont == 0)
        {
            temp = root;
        }
        if(temp == null)
        {
            System.out.println("El árbol está vacío");
            return;
        }        
        if(temp.left != null)
            temp = temp.left;
        else
            return;
        inOrder(1);
        System.out.println(temp.getValue());
        temp = temp.right;
        inOrder(1);
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
        
        //int res = dt.find(5, 0);
        //System.out.println("resultado: " + res);
        
        dt.inOrder(0);
    }
}
