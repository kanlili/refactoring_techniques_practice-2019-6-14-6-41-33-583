package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BannerRenderTest {
     private static BannerRender bannerRender;
    @Before
     public  void init(){
         bannerRender=new BannerRender();
     }
     @Test
     public void should_return_IEonMac_when_call_renderBanner_given_macie(){
          String result= bannerRender.renderBanner("MAC","IE");
          String expectResult="IE on Mac?";
          assertEquals(expectResult,result);
      }
    @Test
    public void should_return_IEonMac_when_call_renderBanner_given_kacki(){
        String result= bannerRender.renderBanner("KAC","KE");
        String expectResult="banner";
        assertEquals(expectResult,result);
    }
}
