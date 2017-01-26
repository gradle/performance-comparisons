package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24984 {
    private final Productionnull_24984 production = new Productionnull_24984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}