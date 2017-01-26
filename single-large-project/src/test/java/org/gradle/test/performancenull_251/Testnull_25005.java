package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25005 {
    private final Productionnull_25005 production = new Productionnull_25005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}