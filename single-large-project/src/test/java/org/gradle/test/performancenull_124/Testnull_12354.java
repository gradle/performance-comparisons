package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12354 {
    private final Productionnull_12354 production = new Productionnull_12354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}