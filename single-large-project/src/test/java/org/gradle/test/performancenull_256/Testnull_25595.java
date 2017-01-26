package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25595 {
    private final Productionnull_25595 production = new Productionnull_25595("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}