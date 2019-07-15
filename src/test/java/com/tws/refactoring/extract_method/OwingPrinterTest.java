package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
        Order order=new Order(12.0);
        OwingPrinter owingPrinter=new OwingPrinter();
        String name="lisi";
        List<Order>orders=new ArrayList<>();
        orders.add(order);
        owingPrinter.printOwing(name,orders);
        String result="*****************************\r\n"
                   +"****** Customer totals ******\r\n"
                   +"*****************************\r\n"
                   +"name: lisi\r\n"+"amount: 12.0\r\n";
        assertEquals(result,outContent.toString());

    }
}