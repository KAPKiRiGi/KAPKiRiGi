package partyaccess;
import javax.swing.JOptionPane;


public class PartyAccess
{

    public static void main(String[] args) 
    {
     String entryAge= JOptionPane.showInputDialog("Enter your age");
     
// Converting a string to int
     int entryAgeNumber = Integer.parseInt(entryAge);
     
     
//     Younger than 18 is denied entry
//    Between 18 and 35 is allowed entry
//    35 and older is too old.
    if (entryAgeNumber <18 || entryAgeNumber>35)
        {
          JOptionPane.showMessageDialog(null,"You may not proceed to party. Go home!");  
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Please continue with admission");
        }

if(entryAgeNumber<=35 && entryAgeNumber>=18)
        {

//Gender check    
           String entryGender= JOptionPane.showInputDialog("Are you Male or Female? (Enter either Male or Female");
           String Male="Male";
           String Female="Female";
    //check if user is male or female
    if( entryGender.equalsIgnoreCase(Male))
        {
        JOptionPane.showMessageDialog(null,"Please pay R10 entry fee. Enjoy the party!");
        }
            else 
              {
                    if(entryGender.equalsIgnoreCase(Female))
                    {
                    JOptionPane.showMessageDialog(null,"You may proceed to party.Enjoy!");
                    }
              }
        }                
    }
}
    
    
    

