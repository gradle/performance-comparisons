package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41300 {
    private final Productionnull_41300 production = new Productionnull_41300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}