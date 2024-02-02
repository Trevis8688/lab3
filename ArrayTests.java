import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

import java.util.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, input);
  }

  @Test
  public void testReversed2(){
    int[] input = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testFilter(){
    ArrayList<String> test = new ArrayList<String>();
    ArrayList<String> expected = new ArrayList<String>();
    test.add("Hello");
    test.add("World");
    test.add("I");
    test.add("am");
    test.add("Trevor");
    expected.add("Hello");
    expected.add("World");
    expected.add("Trevor");

    StringChecker sc = new LongerThanThree();

    assertEquals(expected, ListExamples.filter(test, sc));

  }

  @Test
  public void testMerge(){
    
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    list1.add("a");
    list1.add("c");
    list1.add("e");
    list2.add("b");
    list2.add("d");
    list2.add("z");


    ArrayList<String> expected= new ArrayList<>();
    expected.add("a");
    expected.add("b");
    expected.add("c");
    expected.add("d");
    expected.add("e");

    assertEquals(expected,ListExamples.merge(list1,list2));
  }

  @Test
  public void testAppend(){
    LinkedList test = new LinkedList();
    test.append(1);
    test.append(2);
    test.append(3);
    test.append(4);
    assertEquals("1 2 3 4", test.toString());
  }
}
