package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23328 {
    private final Productionnull_23328 production = new Productionnull_23328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}