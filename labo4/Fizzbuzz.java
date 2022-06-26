public class Fizzbuzz {

  public String fizzBuzz(int n){

    String out = "";

    if(n%3==0){
      out += "fizz";
    }

    if(n%5==0){
      out += "buzz";
    }

    

    if(n%5 != 0 && n%3 != 0){
      out = Integer.toString(n);
    }

    return out;




  }
}