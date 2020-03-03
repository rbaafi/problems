package edu.cnm.edu;

public class Problems {


/*
  Given a string, return a string where for every char in the original, there are two chars.


      doubleChar("The") → "TThhee"
  doubleChar("AAbb") → "AAAAbbbb"
  doubleChar("Hi-There") → "HHii--TThheerree"
*/
  public String doubleChar(String str) {
    String solution = "";
    if (str.equals("")) {
      return str;
    }

    for (int i = 0; i < str.length(); i++) {
        char charAtPosition = str.charAt(i);
        solution = solution + str.charAt(i) + str.charAt(i);

      }

    return solution;
  }

}
