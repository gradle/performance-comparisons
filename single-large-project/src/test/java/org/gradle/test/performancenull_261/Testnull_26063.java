package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26063 {
    private final Productionnull_26063 production = new Productionnull_26063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}