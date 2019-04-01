/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

/**
 *
 * @author r2-weber
 */
public class ArtPiece {
    
    private int itemNum;
    private String description;
    private int value;

    public ArtPiece(int num, String desc, int val){
        
        this.itemNum = num;
        this.description = desc;
        this.value = val;
        
    }
    
    public ArtPiece(){
        
        
    }
    public ArtPiece(String[] split) {
        this.itemNum = Integer.parseInt(split[0]);
        this.description = split[1];
        this.value = Integer.parseInt(split[2]);
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  itemNum + ", " + description + ", " + value;
        
    }
    
    
    
    
    
}
