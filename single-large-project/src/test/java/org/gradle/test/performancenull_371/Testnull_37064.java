package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37064 {
    private final Productionnull_37064 production = new Productionnull_37064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}