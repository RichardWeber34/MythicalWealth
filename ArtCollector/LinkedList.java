/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Rich
 */
public class LinkedList {
    
    private Node Head;
    private Node Tail;
    private int size;
    
    private Node Focus;
    

    
    public LinkedList(){

        this.Head = null;
        this.Tail = null;
        this.size = 0;
        this.Focus = null;
                
    }
    
    public void initFocus(){
        if(size == 0){           
            return;
        }
        setFocus(Head);
    }
    
    public void nextFocus(){
        if(Focus.getNext() != null){
            setFocus(Focus.getNext());
        }
    }
    
    public void prevFocus(){
        if(Focus.getPrevious() != null){
            setFocus(Focus.getPrevious());
        }
        
    }
    
    public String[] listToString(Location a){
        
        
        setFocus(Head);
        String[] ret = new String[size];
        
        for(int i = 0; i < size; i++){
            ret[i] = Focus.getData().toString();
            nextFocus();            
        }
        
        return ret;
    }
    
    
    public int addNodeByVal(Node n){
         
        int nVal = n.getData().getValue();
        int fVal;
        int fNVal;
               
        if (Head == null){
            setHead(n);
            incSize();
            return 1;
        }else if (Tail == null){
            
            if(Head.getData().getValue() < nVal){
            //setFocus(Head);
                setTail(Head);
                setHead(n);
                Head.setNext(Tail);
                Tail.setPrevious(Head);
                
                incSize();
                return 1;                          
        }
            initTail(n);
            incSize();
            return 1;
            
        }
        
        
        setFocus(Head);
        while(Focus.getNext() != null){
            
            fVal = Focus.getData().getValue();
            fNVal = Focus.getNext().getData().getValue();
            if ((nVal < fVal  && fNVal < nVal) || (nVal == fVal)){
                insertFocusNext(n);
                incSize();
                return 1;
            }else if(fVal < nVal){
                insertFocusPrev(n);
                incSize();
                return 1;
            }
            nextFocus();
        }
        if(getSize() == 2){
            setFocus(Head);
            insertFocusNext(n);
            incSize();
            return 1;
            
        }
        if(Focus == Tail){
            insertFocusNext(n);
            incSize();
            return 1;                    
        }
        
        System.out.println("ERROR BRUV");
        return 0;
        
    }
    
    public Node removeFocus(){
        
        if(getSize() == 1){
            nullifyPointers(Focus);
            decSize();
            return Focus;
        }
        
        if(Focus == Head){
            Head.getNext().setPrevious(null);
            setHead(Head.getNext());
            nullifyPointers(Focus);
            decSize();
            return Focus;
        }else if(Focus == Tail){
            Tail.getPrevious().setNext(null);
            setTail(Tail.getPrevious());
            nullifyPointers(Focus);
            decSize();
            return Focus;
        }else{
            Node nxt = Focus.getNext();
            Node pre = Focus.getPrevious();
            
            pre.setNext(nxt);
            nxt.setPrevious(pre);
            nullifyPointers(Focus);
            decSize();
            return Focus;
            
        }
    }
    
    public void insertFocusNext(Node n){
        if(Focus != Tail){
            n.setNext(Focus.getNext());
            Focus.getNext().setPrevious(n);
            Focus.setNext(n);
            n.setPrevious(Focus);
            setFocus(n);            
        }else{        
            Focus.setNext(n);
            n.setPrevious(Focus);
            setFocus(n); 
            setTail(n);
        }
    }
    
    public void insertFocusPrev(Node n){
        if(Focus != Head){
            n.setPrevious(Focus.getPrevious());
            Focus.getPrevious().setNext(n);
            Focus.setPrevious(n);
            n.setNext(Focus);
            setFocus(n);
        }else{
            Focus.setPrevious(n);
            n.setNext(Focus);            
            setHead(n);
            setFocus(Head);
        }
    }
    
    public void incSize(){
        this.size++; 
    }
    
    public void decSize(){
        this.size--;        
    }

    public void nullifyPointers(Node n){
        
        n.setPrevious(null);
        n.setNext(null);        
    }

    public Node getHead() {
        return Head;
    }

    public Node getTail() {
        return Tail;
    }

    public int getSize() {
        return size;
    }

    public Node getFocus() {
        return Focus;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    } 

    public void setTail(Node Tail) {
        this.Tail = Tail;
    }
    
    public void initTail(Node Tail){
        if(Tail.getData().getValue() > Head.getData().getValue()){
            setFocus(Head);
        }
        
        this.Tail = Tail;
        this.Tail.setPrevious(Head);
        Head.setNext(Tail);
        
    }

    public void setFocus(Node Focus) {
        this.Focus = Focus;
    }

    public int calcTotal() {
        int tot = 0;
        
        setFocus(Head);
        
        while(Focus.getNext() != null){
            tot += Focus.getData().getValue();
            nextFocus();
        }        
        
        return tot;
    }
    
    public Node seqSearchItem(int itemNum){
        
        setFocus(Head);
        while(Focus != null){
            if(Focus.getData().getItemNum() == itemNum){
                return Focus;
                
            }else{
                nextFocus();
            }
        }
        JOptionPane.showMessageDialog(null, "Item Not Found");
        return null;
    }
    
    public Node seqSearchVal(Node P){
        int value = P.getData().getValue();
        setFocus(Tail);
        while(Focus != null){
            if(Focus.getData().getValue() >=  value){
                return Focus;
            
            }else{
                prevFocus();      
            }
        } 
        JOptionPane.showMessageDialog(null, "There isnt an item larger");
        return null;

    }
    
    public Node swapPieces(Node P, Node N){
        
        setFocus(N);
        P.setNext(Focus.getNext());
        P.setPrevious(Focus.getPrevious());
        
        N = removeFocus();
        return N;
    }
}
