package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2373 {
    private final Productionnull_2373 production = new Productionnull_2373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}