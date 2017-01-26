package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28260 {
    private final Productionnull_28260 production = new Productionnull_28260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}