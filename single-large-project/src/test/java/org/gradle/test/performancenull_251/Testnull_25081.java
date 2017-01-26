package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25081 {
    private final Productionnull_25081 production = new Productionnull_25081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}