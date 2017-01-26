package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12709 {
    private final Productionnull_12709 production = new Productionnull_12709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}