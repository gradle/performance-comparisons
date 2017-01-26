package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25007 {
    private final Productionnull_25007 production = new Productionnull_25007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}