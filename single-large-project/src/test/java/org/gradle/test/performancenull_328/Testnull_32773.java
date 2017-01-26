package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32773 {
    private final Productionnull_32773 production = new Productionnull_32773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}