/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citaddressbook;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author enoch
 */
public class FXMLDocumentController implements Initializable {

    // Specify the size of five string field in the record 
    static int NAME_SIZE = 32;
    final static int STREET_SIZE = 32;
    final static int CITY_SIZE = 20;
    final static int STATE_SIZE = 2;
    final static int ZIP_SIZE = 5;
    final static int RECORD_SIZE
            = (NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE);

    // Access address.fat using RandomAccessFile
    private RandomAccessFile raf;

    @FXML
    private Label label;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnFirst;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnPrevious;
    @FXML
    private Button btnLast;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtStreet;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtZip;
    @FXML
    private TextField txtState;
    @FXML
    private Button btnUpdate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            //read and write
            raf = new RandomAccessFile("address.dat", "rw");

        } catch (IOException ex) {
            System.out.print("Error: " + ex);
            System.exit(1);
        }
    }

    @FXML
    private void btnAddAction(ActionEvent event) {

        // calls writeAddress method 
        writeAddress();
    }

    @FXML
    private void btnFirstAction(ActionEvent event) {
        try {
            // Seek to the beginnning of the file
            if (raf.length() > 0) {

                // read the first address
                readAddress(0);
            }

            //if 0 print out error
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void btnNextAction(ActionEvent event) {

        try {
            //display the next record in the file
            long currentPosition = raf.getFilePointer();
            if (currentPosition < raf.length()) {
                readAddress(currentPosition);
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void btnPrevAction(ActionEvent event) {

        // display the record immediately before the record being displayed
        try {
            long currentPosition = raf.getFilePointer();

            //goes to the beginning of the file being viewed 
            if (currentPosition - 2 * RECORD_SIZE > 0) {

                //goes to the beginning of the previous file
                readAddress(currentPosition - 2 * 2 * RECORD_SIZE);
            } else {

                readAddress(0);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void btnLastAction(ActionEvent event) {

        // Display the very last file in the record
        try {

            //stores location of the file being currently looked at
            long lastPosition = raf.length();

            //move the location to the very last file
            if (lastPosition > 0) {
                readAddress(lastPosition - 2 * RECORD_SIZE);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void btnUpdateAction(ActionEvent event) throws ClassNotFoundException, IOException {

        try {
            // gets the location of where the pointer is at
            long currentPosition = raf.getFilePointer();

            //moves the location of the pointer to the begining of the file being looked at
            raf.seek(currentPosition - 1 * 2 * RECORD_SIZE);

            //writes over the recored being displayed
            writeFixedLengthString(txtName.getText(), NAME_SIZE, raf);
            writeFixedLengthString(txtStreet.getText(), STREET_SIZE, raf);
            writeFixedLengthString(txtCity.getText(), CITY_SIZE, raf);
            writeFixedLengthString(txtState.getText(), STATE_SIZE, raf);
            writeFixedLengthString(txtZip.getText(), ZIP_SIZE, raf);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //Read a record at the specified position
    public void readAddress(long position) throws IOException {
        raf.seek(position);
        String name = readFixedLengthString(NAME_SIZE, raf);
        String street = readFixedLengthString(STREET_SIZE, raf);
        String city = readFixedLengthString(CITY_SIZE, raf);
        String state = readFixedLengthString(STATE_SIZE, raf);
        String zip = readFixedLengthString(ZIP_SIZE, raf);

        txtName.setText(name);
        txtStreet.setText(street);
        txtCity.setText(city);
        txtState.setText(state);
        txtZip.setText(zip);
    }

    public static String readFixedLengthString(int size,
            DataInput in) throws IOException {
        
        // Declare an array of characters
        char[] chars = new char[size];

        // Read fixed number of characters to the array
        for (int i = 0; i < size; i++) {
            chars[i] = in.readChar();
        }

        return new String(chars);
    }

    //Write a record at the end of the file
    public void writeAddress() {
        try {
            raf.seek(raf.length());
            writeFixedLengthString(txtName.getText(), NAME_SIZE, raf);
            writeFixedLengthString(txtStreet.getText(), STREET_SIZE, raf);
            writeFixedLengthString(txtCity.getText(), CITY_SIZE, raf);
            writeFixedLengthString(txtState.getText(), STATE_SIZE, raf);
            writeFixedLengthString(txtZip.getText(), ZIP_SIZE, raf);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Write fixed number of characters to a DataOutput stream
    public static void writeFixedLengthString(String s, int size,
            DataOutput out) throws IOException {
        char[] chars = new char[size];

        // Fill in string with characters
        s.getChars(0, Math.min(s.length(), size), chars, 0);

        // Fill in blank characters in the rest of the array
        for (int i = Math.min(s.length(), size); i < chars.length; i++) {
            chars[i] = ' ';
        }

        // Create and write a new string padded with blank characters
        out.writeChars(new String(chars));
    }

}
