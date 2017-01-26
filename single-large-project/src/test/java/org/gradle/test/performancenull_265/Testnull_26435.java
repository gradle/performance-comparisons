package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26435 {
    private final Productionnull_26435 production = new Productionnull_26435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}