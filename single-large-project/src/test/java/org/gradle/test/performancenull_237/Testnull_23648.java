package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23648 {
    private final Productionnull_23648 production = new Productionnull_23648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}