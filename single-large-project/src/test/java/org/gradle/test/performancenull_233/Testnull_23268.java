package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23268 {
    private final Productionnull_23268 production = new Productionnull_23268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}