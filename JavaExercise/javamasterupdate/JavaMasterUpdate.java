/*
 * enoch ajagbe
 * data Structures 
 * 11/27/2017
 * JavaMasterUpdate: compares info of 2 files then merges them to make one
 */
package javamasterupdate;

/**
 *
 * @author enoch
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class JavaMasterUpdate {

    private static final String MASTER = "MasterFile.txt";
    private static final String NEW_MASTER = "NewMasterFile.txt";
    private static final String TRANSACTION = "TransactionFile.txt";
    private static final String COMMA = ",";

    private BufferedReader mfb;
    private BufferedReader tfb;
    private BufferedWriter nmfb;

    private static String[] masterRecArray = new String[4];
    private static String[] transRecArray = new String[4];

    private boolean masterEOF = false;
    private boolean transEOF = false;

    private String masterRecord;
    private String transRecord;

    private Integer masterRecCount = 0;
    private Integer tranRecCount = 0;

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        JavaMasterUpdate javaMasterUpdate;
        javaMasterUpdate = new JavaMasterUpdate();
    }
    
    public JavaMasterUpdate() throws FileNotFoundException, IOException {
        openFiles();
        doUpdate();
        closeFiles();
    }

    public void openFiles() throws FileNotFoundException, IOException {

        //opnes/reads each file using buffereader
        try {
            mfb = new BufferedReader(new FileReader(MASTER)); //
            tfb = new BufferedReader(new FileReader(TRANSACTION));
            nmfb = new BufferedWriter(new FileWriter(NEW_MASTER));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaMasterUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaMasterUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

        //reads each line in the file
        for (String line; (line = tfb.readLine()) != null;) {
            transRecArray = line.split(" ");

            //transfer file from array to a String 
            transRecord = transRecArray.toString();

        }

        //reads each line in the file
        for (String lineSecond; (lineSecond = mfb.readLine()) != null;) {
            masterRecArray = lineSecond.split(" ");

            //transfer file from array to a Strin
            masterRecord = masterRecArray.toString();

        }

    }

    //update the information by transfering files 
    private void doUpdate() throws IOException {
        for (int i = 0; i < masterRecord.length(); i++) { // for loop to read the master file 
            if (masterRecord.(i).equals(transRecArray)) { //checks if any information is missing 
                masterRecord.remove(i); //if the information is outdated remove 
                writeMasterRecord(nmfb); // writes the new information to the new file 
            } else {
            }

        }
    }

    //opens transRecord information 
    private void loadTransRecord() {
        try {
            transRecord = tfb.readLine();
        } catch (IOException ex) {
            Logger.getLogger(JavaMasterUpdate.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //writes to the Master Record to combine missing information
    private void writeMasterRecord() throws IOException {
        nmfb.write(transRecord);
    }

    //closes the files after completion
    private void closeFiles() throws IOException {
        mfb.close();
        tfb.close();
        nmfb.close();

    }
}
