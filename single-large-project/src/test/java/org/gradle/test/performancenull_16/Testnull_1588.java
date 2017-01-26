package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1588 {
    private final Productionnull_1588 production = new Productionnull_1588("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}