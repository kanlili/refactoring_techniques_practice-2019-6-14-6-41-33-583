package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BannerRenderTest {
      @Test
      public void should_return_IEonMac_when_call_renderBanner_given_macie(){
          BannerRender bannerRender=new BannerRender();
          String result= bannerRender.renderBanner("MAC","IE");
          String expectResult="IE on Mac?";
          assertEquals(expectResult,result);
      }
    @Test
    public void should_return_IEonMac_when_call_renderBanner_given_kacki(){
        BannerRender bannerRender=new BannerRender();
        String result= bannerRender.renderBanner("KAC","KE");
        String expectResult="banner";
        assertEquals(expectResult,result);
    }
}
