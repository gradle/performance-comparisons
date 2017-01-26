package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1402 {
    private final Productionnull_1402 production = new Productionnull_1402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}