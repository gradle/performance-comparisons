package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2801 {
    private final Productionnull_2801 production = new Productionnull_2801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}