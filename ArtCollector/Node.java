/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

/**
 *
 * @author Rich
 */
public class Node {
    
    private Node Previous;
    private ArtPiece Data;
    private Node Next;
    
    public Node(ArtPiece Data){
        
        this.Previous = null;
        this.Data = Data;
        this.Next = null;
        
    }
    
    public Node(Node Prev, ArtPiece Data, Node Next){
        
        
    }
    
    public Node(){
        
        
    }
    
//    @Override
//    public String toString() {
//        return Data.toString();
//        
//    }

    public Node getPrevious() {
        return Previous;
    }

    public ArtPiece getData() {
        return Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setPrevious(Node Previous) {
        this.Previous = Previous;
    }

    public void setData(ArtPiece Data) {
        this.Data = Data;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }
    
}
