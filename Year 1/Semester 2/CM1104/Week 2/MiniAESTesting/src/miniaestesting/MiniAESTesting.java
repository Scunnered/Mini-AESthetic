package miniaestesting;
import java.util.*;
/**
 *
 * @author Saul
 */



class Tables {
    
    //-----------------------------//Constructor//------------------------------//
    public Tables(){}
    
    
    //-----------------------------//Methods//-----------------------------//
    public HashMap fillSubTable(HashMap emptyTable, boolean isInverse){
    if(isInverse==false){           // if isInverse is false (ie, if it is a keyNibbleSub or a normal nibleSub operation)
    emptyTable.put(0b0000, 0b1110);
    emptyTable.put(0b0001, 0b0100);
    emptyTable.put(0b0010, 0b1101);
    emptyTable.put(0b0011, 0b0001);
    emptyTable.put(0b0100, 0b0010);
    emptyTable.put(0b0101, 0b1111);
    emptyTable.put(0b0110, 0b1011);
    emptyTable.put(0b0111, 0b1000);
    emptyTable.put(0b1000, 0b0011);
    emptyTable.put(0b1001, 0b1010);
    emptyTable.put(0b1010, 0b0110);
    emptyTable.put(0b1011, 0b1100);
    emptyTable.put(0b1100, 0b0101);
    emptyTable.put(0b1101, 0b1001);
    emptyTable.put(0b1110, 0b0000);
    emptyTable.put(0b1111, 0b0111);}
                                    //Call the .put method, fill the HashMap with the NibbleSub table
    
    else{ // else
    emptyTable.put(0b0000, 0b1110);
    emptyTable.put(0b0001, 0b0011);
    emptyTable.put(0b0010, 0b0100);
    emptyTable.put(0b0011, 0b1000);
    emptyTable.put(0b0100, 0b0001);
    emptyTable.put(0b0101, 0b1100);
    emptyTable.put(0b0110, 0b1010);
    emptyTable.put(0b0111, 0b1111);
    emptyTable.put(0b1000, 0b0111);
    emptyTable.put(0b1001, 0b1101);
    emptyTable.put(0b1010, 0b1001);
    emptyTable.put(0b1011, 0b0110);
    emptyTable.put(0b1100, 0b1011);
    emptyTable.put(0b1101, 0b0010);
    emptyTable.put(0b1110, 0b0000);
    emptyTable.put(0b1111, 0b0101);}   
                                   //Call the .put method, fill the HashMap with the Inverse Nibble Sub table
    return emptyTable; // return the filled HashMap
    }
    
    public int[][] fillHexTable(){
    int[][] table = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF},
        {0, 2, 4, 6, 8, 0xA, 0xC, 0xE, 3, 1, 7, 5, 0xB, 9, 0xF, 0xD},
        {0, 3, 6, 5, 0xC, 0xF, 0xA, 9, 0xB, 8, 0xD, 0xE, 7, 4, 1, 2},
        {0, 4, 8, 0xC, 3, 7, 0xB, 0xF, 6, 2, 0xE, 0xA, 5, 1, 0xD, 9},
        {0, 5, 0xA, 0xF, 7, 2, 0xD, 8, 0xE, 0xB, 4, 1, 9, 0xC, 3, 6},
        {0, 6, 0xC, 0xA, 0xB, 0xD, 7, 1, 5, 3, 9, 0xF, 0xE, 8, 2, 4},
        {0, 7, 0xE, 9, 0xF, 8, 1, 6, 0xD, 0xA, 3, 4, 2, 5, 0xC, 0xB},
        {0, 8, 3, 0xB, 6, 0xE, 5, 0xD, 0xC, 4, 0xF, 7, 0xA, 2, 9, 1},
        {0, 9, 1, 8, 2, 0xB, 3, 0xA, 4, 0xD, 5, 0xC, 6, 0xF, 7, 0xE},
        {0, 0xA, 7, 0xD, 0xE, 4, 9, 3, 0xF, 5, 8, 2, 1, 0xB, 6, 0xC},
        {0, 0xB, 5, 0xE, 0xA, 1, 0xF, 4, 7, 0xC, 2, 9, 0xD, 6, 8, 3},
        {0, 0xC, 0xB, 7, 5, 9, 0xE, 2, 0xA, 6, 1, 0xD, 0xF, 3, 4, 8},
        {0, 0xD, 9, 4, 1, 0xC, 8, 5, 2, 0xF, 0xB, 6, 3, 0xE, 0xA, 7},
        {0, 0xE, 0xF, 1, 0xD, 3, 2, 0xC, 9, 7, 6, 8, 4, 0xA, 0xB, 5},
        {0, 0xF, 0xD, 2, 9, 6, 4, 8, 1, 0xE, 0xC, 3, 8, 7, 5, 0xA}
    };
    // Return the hex-multiplication table used in MixColumns
    return table;}
}


class Substitutions{
    //-----------------------------//Fields//-----------------------------//
    private Tables tables;
    private HashMap<Integer, Integer> subTable;
   
    //-----------------------------//Constructor//-----------------------------//
    public Substitutions(){
         this.tables = new Tables();
         this.subTable = new HashMap<>();
    }    
    
    //-----------------------------//Methods//-----------------------------//
    public int keyNibbleSub(int nibble){
         tables.fillSubTable(subTable, false); // Call a helper method to fill the HashMap with key-value pairs
    
         // Get the substitution value for the nibble and return it
    return subTable.get(nibble);
    }
    
    
    public int[][] nibbleSub(int[][] cipherState, boolean isInverse){
    int[][] nextCipherState = new int[2][2]; // Declare and initialise empty 2x2 array
    
    tables.fillSubTable(subTable, isInverse); // Call a helper method to fill the HashMap with key-value pairs
    
    for(int row = 0; row<=1; row++){
        for(int col = 0; col<=1; col++){ 
                                                     // For each element in block
            
            nextCipherState[row][col] = subTable.get(cipherState[row][col]); // Call the .get method on the HashMap, using the element as a key-lookup
                                                                   // Assign the returned element to the index in returnBlock
        
        
        }
    }
    
    return nextCipherState;    
}
    

}     
    
    


class KeySet{
    //-----------------------------//Fields//-----------------------------//
    
    private int[][] key_0, key_1, key_2;
    private Substitutions substitutions;
    private Tables tables;
    
//-----------------------------//Constructor//-----------------------------//

    public KeySet(int[][] startingKey){
        this.substitutions = new Substitutions();
        this.key_0 = startingKey;
        this.key_1 = genKey(key_0, 1);
        this.key_2 = genKey(key_1, 2);

    }
    //-----------------------------//Methods//-----------------------------//
    private int[][] genKey(int[][] key, int roundConst){
    int[][] newKey = new int[2][2]; // Declare an empty 2x2 array to store the new key
    newKey[0][0] = key[0][0] ^ substitutions.keyNibbleSub(key[1][1]) ^ roundConst; // For the first nibble in the new key,
                                                                     // XOR the first value in the given key
                                                                     // with the nibbleSub of the final value in the given key
                                                                     //, and with the rounding constant variable
    newKey[0][1] = key[0][1] ^ newKey[0][0]; 
    newKey[1][0] = key[1][0] ^ newKey[0][1];
    newKey[1][1] = key[1][1] ^ newKey[1][0];
                                            // Generate the other three nibbles
    return newKey;
}
    
    //----Getter methods for full implementation---//
    
    public int[][] getKey_0() {return key_0;}
    public int[][] getKey_1() {return key_1;}
    public int[][] getKey_2() {return key_2;}    

}


class MiniAES{
    
    //-----------------------------//Fields//-----------------------------//
    
    private KeySet keys;
    
    private String finalString;
    private int[][] character;
    private int[][] cipherState;
    
    private Substitutions substitutions;
    private Tables tables;
        
    //-----------------------------//Constructor//-----------------------------//
    
    public MiniAES(){
        this.substitutions = new Substitutions(); // Creates a Substitutions table for use in NibbleSub
        this.tables = new Tables(); // Creates a Tables object for use in MixColumns
         
    }
    
    //-----------------------------//Quasi-Main Methods//-----------------------------//
    
public String encryptString(String startingString, String startKey){
    
    this.finalString = "";                                                      // Initialises finalString to an empty string
    this.keys = new KeySet(convertToArray(startKey));                           // Key schedule
    
    for(int i = 0; i<startingString.length(); i++){                             // For each character in the plaintext string:
        
        String charAsBinaryString = Integer.toBinaryString(startingString.charAt(i)); // Convert it to a binary string
        while(charAsBinaryString.length()<16){charAsBinaryString="0"+charAsBinaryString;} // Add leading zeros to make it 16 long
        
        character = convertToArray(charAsBinaryString);                         // Convert binary string a 2x2 array of int
        cipherState = encryptChar(character);                                   // Encrypt this array and return it
        
        finalString += convertToString(cipherState);                            // Convert encrypted block back to a string and append it to finalString
    }   
    return finalString;
} 

public String decryptString(String startingString, String startKey){
    this.finalString = "";                                                      // Initialises finalString to an empty string
    this.keys = new KeySet(convertToArray(startKey));                           // Key schedule
    
    for(int i = 0; i<startingString.length(); i++){                             // For each character in the ciphertext String
        
        String charAsBinaryString = Integer.toBinaryString(startingString.charAt(i)); // Convert it to a binary string
        while(charAsBinaryString.length()<16){charAsBinaryString="0"+charAsBinaryString;} // Add leading zeros to make it 16 long
        
        character = convertToArray(charAsBinaryString);                         // Convert binary string to a 2x2 array of int
        cipherState = decryptChar(character);                                   // Decrypt this array and return it
       
        
        finalString += convertToString(cipherState);                            //Convert decrypted block back to a string and append it to finalString
    }

    return finalString;
}
        

//-----------------------------//Conversion Methods//-----------------------------//

public static String convertToString(int[][] array) {
        String[][] toFill = new String[2][2];                                   // Declare and initialise a new 2x2 array of String
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {                             
                                                                                // For each value in the array:
                toFill[i][j] = Integer.toBinaryString(array[i][j]);             // Convert it to binary string and add to toFill
                
                while (toFill[i][j].length() <= 3) {toFill[i][j] = "0" + toFill[i][j];} // Add leading zeros to make it 4 long
            }
        }
        
        String charAsBinaryString = toFill[0][0] + toFill[0][1] + toFill[1][0] + toFill[1][1]; // Append nibbles together
        
        
        int asInteger = Integer.parseInt(charAsBinaryString, 2);                // Parse an integer from the string
      
        String charAsString = Character.toString((char) asInteger);             // Typecast as char and convert to String
        
        return charAsString;
    }

public static int[][] convertToArray(String toConvert) {
        int[][] newBlock = new int[2][2];                                       // Declare and initialise a new 2x2 array of int
        
        newBlock[0][0] = Integer.parseInt(toConvert.substring(0,4), 2);
        newBlock[0][1] = Integer.parseInt(toConvert.substring(4,8), 2);
        newBlock[1][0] = Integer.parseInt(toConvert.substring(8,12), 2);
        newBlock[1][1] = Integer.parseInt(toConvert.substring(12,16), 2);
                                                                                // Split a 16-bit binary string into four nibbles
        
        return newBlock;
    }

//-----------------------------//Methods//-----------------------------//

private int[][] encryptChar(int[][] character){
    addRoundKey(character, keys.getKey_0()); 
    cipherState = substitutions.nibbleSub(cipherState, false);
    shiftRows();
    mixColumns();
    addRoundKey(cipherState, keys.getKey_1());
    cipherState = substitutions.nibbleSub(cipherState, false);
    shiftRows();
    addRoundKey(cipherState, keys.getKey_2());
                                                                                // The order of operations for an encryption
    return cipherState;
}
    
private int[][] decryptChar(int[][] character){  
   addRoundKey(character, keys.getKey_2());
   cipherState = substitutions.nibbleSub(cipherState, true);
   shiftRows();   
   addRoundKey(cipherState, keys.getKey_1());
   mixColumns();
   cipherState = substitutions.nibbleSub(cipherState, true);
   shiftRows();
   addRoundKey(cipherState, keys.getKey_0());
                                                                                // Order of operations for a decryption
   return cipherState;
   }


private void addRoundKey(int[][] cipherState, int[][] key){
        int[][] nextCipherState = new int[2][2]; // Declare and initialise an empty 2x2 array
    
        for(int row = 0; row<cipherState.length; row++){
            for(int col = 0; col<cipherState[0].length; col++){
                                                                // For each element in  cipherState
                nextCipherState[row][col] = cipherState[row][col]^key[row][col]; // XOR it with the corresponding element in key
                                                                                 // Assign it to the same index in nextCipherState
            }
        }
        this.cipherState = nextCipherState;
    }

private void shiftRows(){
    int[][] nextCipherState = new int[2][2]; // Declare and initialise new array
    
    nextCipherState[0][0] = this.cipherState[0][0]; 
    nextCipherState[0][1] = this.cipherState[0][1]; 
                                             //Copy the values from cipherState into the top row of the new array
                                                
    nextCipherState[1][0] = this.cipherState[1][1];
    nextCipherState[1][1] = this.cipherState[1][0];
                                             //Copy the values from cipherState into the bottom row of the new array, in reverse order
    
    this.cipherState = nextCipherState;
}  

private void mixColumns(){ 
    int[][] nextCipherState = new int[2][2]; // Declare and initialise empty 2x2 array
    
    nextCipherState[0][0] = hexSubstitution(this.cipherState[0][0], this.cipherState[1][0], 0); 
    nextCipherState[1][0] = hexSubstitution(this.cipherState[0][0], this.cipherState[1][0], 1);
    nextCipherState[0][1] = hexSubstitution(this.cipherState[0][1], this.cipherState[1][1], 0);
    nextCipherState[01][1] = hexSubstitution(this.cipherState[0][1], this.cipherState[1][1], 1);
                                                                                 
    this.cipherState = nextCipherState;                                                                                 
}
private int hexSubstitution(int topRowElement, int bottomRowElement, int constRow){
    int[][] hexTable = tables.fillHexTable(); // Declare an empty 2d array and call the getHexTable() helper method to fill it
                                      // Due to the large size of the hex table, this is implemented for readability.
    int[][] constantMatrix = {
        {0b0011, 0b0010}, 
        {0b0010, 0b0011}}; // declare and fill the 2d array which stores the constant matrix
    
    int hexCol, XOR_operand_1, XOR_operand_2; // Declare variables
    
    hexCol = constantMatrix[constRow][0]; // Get index for the hex table lookup 
    XOR_operand_1 = hexTable[hexCol][topRowElement]; // Find the appropriate element in hexTable and assign to XOR_operand_1
    
    hexCol = constantMatrix[constRow][1]; // // Get index for the hex table lookup
    XOR_operand_2 = hexTable[hexCol][bottomRowElement]; // Find the appropriate elemen tin hexTable and assign to XOR_operand_2
    
    return XOR_operand_1^XOR_operand_2; // XOR the two operands and return the result
}



}
public class MiniAESTesting {
    public static void main(String[] args) {
        MiniAES encryption1 = new MiniAES();
        
        String key = "0011100101100111";
        String text = "ok this is some text";
        
        String encryptedText = encryption1.encryptString(text, key);
        String decryptedText = encryption1.decryptString(encryptedText,key);
        
        System.out.println("Key: "+key);
        System.out.println("Plaintext: "+text);
        System.out.println("Result: "+encryptedText);
        
        System.out.println("\nKey: "+key);
        System.out.println("Plaintext: "+encryptedText);
        System.out.println("Result: "+decryptedText);
        
        
        
         }
    
}