package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Before;
import org.junit.Test;

//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
      private static PriceCalculator priceCalculator;
      @Before
      public  void init(){
          priceCalculator=new PriceCalculator();
      }
      @Test
       public  void should_return_price_when_call_getPrice_given_number1(){
       double result= priceCalculator.getPrice(500,1);
       double expectResult=550.0;
       assertThat(expectResult,is(result));
       }
     @Test
      public  void should_return_price_when_call_getPrice_given_number2(){
      double result= priceCalculator.getPrice(100,1);
      double expectResult=110.0;
      assertThat(expectResult,is(result));
      }
     @Test
     public  void should_return_price_when_call_getPrice_given_number3() {
      double result = priceCalculator.getPrice(600, 1);
      double expectResult = 655.0;
      assertThat(expectResult, is(result));
     }
}
