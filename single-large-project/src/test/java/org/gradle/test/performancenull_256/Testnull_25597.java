package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25597 {
    private final Productionnull_25597 production = new Productionnull_25597("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}