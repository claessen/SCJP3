//Filename: Client.java
package PGJC3_Ch01.Example_1_4;

import PGJC3_Ch01.Example_1_3.*;

public class Client {

  public static void main(String[] args) {

    // Create a stack.
    PrintableCharStack stack = new PrintableCharStack(40);

    // Create a string to push on the stack:
    String str = "!no tis ot nuf era skcatS";
    int length = str.length();
    System.out.println("Original string: " + str);

    // Push the string char by char onto the stack:
    for (int i = 0; i < length; i++) {
      stack.push(str.charAt(i));
    }
    
    /* Added after PrintableCharStack was substituted: */
    System.out.println("Now, make use of the new method in PrintableCharStack....");
    stack.printStackElements();

    System.out.print("Reversed string: ");
    // Pop and print each char from the stack:
    while (!stack.isEmpty()) { // Check if the stack is not empty.
      System.out.print(stack.pop());
    }
    System.out.println();
   
  }
}