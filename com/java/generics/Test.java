package com.java.generics;

//this is bounded type -- added extends Number means only Number and it's child classes can  be acceptable
//we can bound the type parameter for a particular range by using extends keyword such types are called Bounded Types

/* Example
class Test<T>{
  }

  Test<Integer> t1 = new Test<Integer>();
  Test<String> t2 = new Test<String>();

*/
//As the type paramter , we can any type and there are no restrictions Hence, it is unbounded Type.


public class Test<T extends  Number>{

    /*public void sum(T a, T b){
        T c = null,d = null;
        System.out.println(c+d);

        return a+b;
    }*/

}
