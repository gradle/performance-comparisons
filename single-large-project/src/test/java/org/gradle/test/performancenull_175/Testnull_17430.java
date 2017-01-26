package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17430 {
    private final Productionnull_17430 production = new Productionnull_17430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}