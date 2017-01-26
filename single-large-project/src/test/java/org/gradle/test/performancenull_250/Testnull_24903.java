package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24903 {
    private final Productionnull_24903 production = new Productionnull_24903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}