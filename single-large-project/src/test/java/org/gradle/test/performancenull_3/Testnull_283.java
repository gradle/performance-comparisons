package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_283 {
    private final Productionnull_283 production = new Productionnull_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}