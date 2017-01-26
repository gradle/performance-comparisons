package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17489 {
    private final Productionnull_17489 production = new Productionnull_17489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}