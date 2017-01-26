package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2282 {
    private final Productionnull_2282 production = new Productionnull_2282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}