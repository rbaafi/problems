package edu.cnm.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemsTest {

  Problems problems = new Problems();

  @Test
  void doubleChar() {
    String input = "HAPPY";
    String output = "HHAAPPPPYY";
    assertEquals(output, problems.doubleChar(input));
  }
}