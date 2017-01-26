package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23370 {
    private final Productionnull_23370 production = new Productionnull_23370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}