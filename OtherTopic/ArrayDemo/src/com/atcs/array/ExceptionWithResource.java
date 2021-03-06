package com.atcs.array;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class ExceptionWithResource {
	public static void main(String args[]) {
		
		
		
		
	   //Serialization and Deserialization
		
		//it is used when you need to send the object from one location to another on internet 
		
		//it will divide into small packet
		
		//De-serialization 
		
		// Using try-with-resources
		try ( // Using multiple resources
				FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
				InputStream input = new FileInputStream("abc.txt")) {
			
			//fileOutputStream.close();
			//input.close();
			// -----------------------------Code to write data into
			// file--------------------------------------------//
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("------------Data written into file--------------");
			System.out.println(msg);
			// -----------------------------Code to read data from
			// file---------------------------------------------//
			// Creating input stream instance
			DataInputStream inst = new DataInputStream(input);
			int data = input.available();
			// Returns an estimate of the number of bytes that can be read from this input
			// stream.
			byte[] byteArray2 = new byte[data]; //
			inst.read(byteArray2);
			String str = new String(byteArray2); // passing byte array into String constructor
			System.out.println("------------Data read from file--------------");
			System.out.println(str); // display file data
			fileOutputStream.close();
			input.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}