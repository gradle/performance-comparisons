package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23290 {
    private final Productionnull_23290 production = new Productionnull_23290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}