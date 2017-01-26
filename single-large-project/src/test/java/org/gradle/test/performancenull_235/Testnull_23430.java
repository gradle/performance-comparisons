package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23430 {
    private final Productionnull_23430 production = new Productionnull_23430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}