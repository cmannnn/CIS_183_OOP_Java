// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields: numStrings, numFrets
   private int numStrings;
   private int numFrets;
   private int strings, frets;
   
   // TODO: Define mutator methods - 
   //      setNumOfStrings(), setNumOfFrets()
   public void setNumOfStrings(int numStrings) {
      strings = numStrings;      
   }
   
   public void setNumOfFrets(int numFrets) {
      frets = numFrets;  
   }

   // TODO: Define accessor methods -
   //      getNumOfStrings(), getNumOfFrets()
   public int getNumOfStrings() {
      return strings;   
   }
   
   public int getNumOfFrets() {
      return frets;
   }
}
