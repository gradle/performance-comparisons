package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25040 {
    private final Productionnull_25040 production = new Productionnull_25040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}