/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import java.io.*;

/**
 *
 * @author sibab
 */
public class Ticket implements Serializable
{
    
    private int firstSelection;
    private int secondSelection;
    private int thirdSelection;
    private int fourthSelection;
    private int fifthSelection;
    private int sixthSelection;

    public Ticket(int firstSelection, int secondSelection, int thirdSelection, int fourthSelection, int fifthSelection, int sixthSelection) 
    {
        this.firstSelection = firstSelection;
        this.secondSelection = secondSelection;
        this.thirdSelection = thirdSelection;
        this.fourthSelection = fourthSelection;
        this.fifthSelection = fifthSelection;
        this.sixthSelection = sixthSelection;
    }
    
    public boolean equals(Ticket ticket)
    {
        int test = 0; 
        if (this.firstSelection == ticket.firstSelection )
        {
            test = test + 1; 
        }
        
        if(this.secondSelection == ticket.secondSelection)
        {
            test = test + 1; 
        }
        if(this.thirdSelection == ticket.thirdSelection)
        {
            test = test + 1; 
        }
         if(this.fourthSelection == ticket.fourthSelection)
        {
            test = test + 1; 
        }
         if(this.fifthSelection == ticket.fifthSelection)
        {
            test = test + 1; 
        }
         if(this.sixthSelection == ticket.sixthSelection)
        {
            test = test + 1; 
        }   
         
        if(test == 6)
        {
            return true; 
        }  
        else 
        {
            return true; 
        }
        
    }

    public int getFirstSelection() {
        return firstSelection;
    }

    public int getSecondSelection() {
        return secondSelection;
    }

    public int getThirdSelection() {
        return thirdSelection;
    }

    public int getFourthSelection() {
        return fourthSelection;
    }

    public int getFifthSelection() {
        return fifthSelection;
    }

    public int getSixthSelection() {
        return sixthSelection;
    }

    public void setFirstSelection(int firstSelection) {
        this.firstSelection = firstSelection;
    }

    public void setSecondSelection(int secondSelection) {
        this.secondSelection = secondSelection;
    }

    public void setThirdSelection(int thirdSelection) {
        this.thirdSelection = thirdSelection;
    }

    public void setFourthSelection(int fourthSelection) {
        this.fourthSelection = fourthSelection;
    }

    public void setFifthSelection(int fifthSelection) {
        this.fifthSelection = fifthSelection;
    }

    public void setSixthSelection(int sixthSelection) {
        this.sixthSelection = sixthSelection;
    }

    
    public String toString() {
        return   firstSelection + " " + secondSelection + " " + thirdSelection + " " + fourthSelection + " " + fifthSelection + " " + sixthSelection;
    }
    
    
    
            
    
}
