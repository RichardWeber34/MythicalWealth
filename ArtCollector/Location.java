/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author r2-weber
 */
public class Location {
    
    private char suffix;
    private String name;
    private int max;
    private LinkedList storage;
    private int total;
    private int remainder;
    

    public Location(char suffix) {
    
        
        this.storage = new LinkedList();
        this.suffix = suffix;
        this.name = "Location " + suffix;
        this.max = 2000000000; //2 billion £
        this.remainder = 0; //needs a function: = insuranceVal - total
        this.total = 0;


        loadLocation(name);
        
        
    }
    
   
    public void loadLocation(String name){  //initializes a location using csv file
                
        Scanner sc = new Scanner(Location.class.getResourceAsStream(name + ".csv"));
        String line;
        String[] piece;
        sc.nextLine();
        
        while(sc.hasNext()){            
            line = sc.nextLine();
            piece = stringSplit(line);
            ArtPiece a = new ArtPiece(piece);
            Node n = new Node(a);
            storage.addNodeByVal(n);
            
       }    
        
        sc.close();
        
    }
    public String[] stringSplit(String s){
        
        String[] result;
        result = s.split(",");
        
        return result;
    }
    

    
    public void calcTotRem(){
        resetTotRem();
        this.total = storage.calcTotal();
        this.remainder = max - total;
                       
    }
   
    public char getSuffix() {
        return suffix;
    }

    public String getName() {
        return name;
    }

    public int getInsuranceVal() {
        return max;
    }

    public LinkedList getStorage() {
        return storage;
    }

    public int getTotal() {
        return total;
    }

    public int getRemainder() {
        return remainder;
    }
    
    public boolean checkSpace(ArtPiece A, Location L){
        if(A.getValue() >= L.remainder){
            return false;
        }else{
            return true;
        }
        
    }   
    
    public void resetTotRem(){
        this.total = 0;
        this.remainder = max;
        
    }
    
    
}


