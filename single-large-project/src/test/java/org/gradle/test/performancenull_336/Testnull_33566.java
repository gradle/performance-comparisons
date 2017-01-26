package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33566 {
    private final Productionnull_33566 production = new Productionnull_33566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}