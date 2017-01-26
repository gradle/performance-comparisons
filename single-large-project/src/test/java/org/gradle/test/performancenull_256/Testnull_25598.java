package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25598 {
    private final Productionnull_25598 production = new Productionnull_25598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}