package edu.cnm.deepdive;

public class ConditionalOperators {

  public static void main(String[] args) {
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = a && b; // false
    boolean e = a || b; // true
    boolean k = a ^ b; // false

    int f = 4;
    boolean g = false && (f++ < 4);//false (because the first operand is false already)
    boolean h = (f-- == 4) && !g; // true (because true && !g or true and true); f = 3.
    //f = 4;

    int myInt = 3;
    int anotherInt = 4;
    boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
    // (true && true) || false; anotherInt = 3, myInt = 3 (myInt = 3 because the second part of the
    // ||statement does not execute anymore given that the first part already gave true.
    // true || false -> true

    boolean x = true, z = false;
    int y = 20;
    x = (y != 10) ^ (z = false);
    //x = (true) ^ (false) so x = true
    //x = true, y = 20, z = false
  }
}
