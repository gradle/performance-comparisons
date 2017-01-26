package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2495 {
    private final Productionnull_2495 production = new Productionnull_2495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}