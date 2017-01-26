package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25569 {
    private final Productionnull_25569 production = new Productionnull_25569("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}