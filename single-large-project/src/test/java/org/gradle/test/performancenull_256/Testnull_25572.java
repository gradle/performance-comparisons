package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25572 {
    private final Productionnull_25572 production = new Productionnull_25572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}