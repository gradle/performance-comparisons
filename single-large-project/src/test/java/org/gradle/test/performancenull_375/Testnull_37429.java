package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37429 {
    private final Productionnull_37429 production = new Productionnull_37429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}