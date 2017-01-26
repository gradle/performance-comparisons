package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4735 {
    private final Productionnull_4735 production = new Productionnull_4735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}