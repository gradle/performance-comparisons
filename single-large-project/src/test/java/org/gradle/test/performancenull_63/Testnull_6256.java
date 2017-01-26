package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6256 {
    private final Productionnull_6256 production = new Productionnull_6256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}