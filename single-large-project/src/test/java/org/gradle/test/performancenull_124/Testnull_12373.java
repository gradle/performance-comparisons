package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12373 {
    private final Productionnull_12373 production = new Productionnull_12373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}