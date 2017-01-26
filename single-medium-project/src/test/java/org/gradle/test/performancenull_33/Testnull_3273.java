package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3273 {
    private final Productionnull_3273 production = new Productionnull_3273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}