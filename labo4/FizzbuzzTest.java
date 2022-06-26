import static org.junit.jupiter.api.Assertions.assertThrows; 
import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.Test;


class FizzbuzzTest {

  // Checking for 3 
  @Test 
  void FizzBuzz_t3(){
    Fizzbuzz pirlo = new Fizzbuzz();
    assertEquals("fizz", pirlo.fizzBuzz(3));
  }

  //Checking for 5 
  @Test 
  void FizzBuzz_t5(){
    Fizzbuzz pirlo = new Fizbuzz();
    assertEquals("buzz", pirlo.fizzBuzz(5));
  }

  //Checking for a number n not divisible by 3 and 5 
  @Test 
  void FizzBuzz_t4(){
    Fizzbuzz pirlo = new Fizzbuzz();
    assertEquals("4", pirlo.fizzBuzz(4));
  }
  
  //Checking for the "buzz" test (number must be divisible by 5 and not by 3) 
  @Test 
  void FizzBuzz_t10(){
    Fizzbuzz pirlo = new Fizzbuzz();
    assertEquals("buzz", pirlo.fizzBuzz(10));
  }

  //Checking for "fizz" test (number must be divisible by 3 and not by 5)
  @Test
  void FizzBuzz_t12(){
    Fizzbuzz pirlo = new Fizzbuzz();
    assertEquals("fizz", pirlo.fizzBuzz(12));
  }

  //Checking for "fizzbuzz" number must be divisible by 3 and 5. 
  @Test 
  void FizzBuzz_t45(){
    Fizzbuzz pirlo = new Fizzbuzz();
    assertEquals("fizzbuzz", pirlo.fizzBuzz(45));
  }



}