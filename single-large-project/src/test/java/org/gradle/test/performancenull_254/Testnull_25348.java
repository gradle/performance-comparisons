package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25348 {
    private final Productionnull_25348 production = new Productionnull_25348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}