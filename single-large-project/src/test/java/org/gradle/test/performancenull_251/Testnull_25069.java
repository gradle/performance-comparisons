package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25069 {
    private final Productionnull_25069 production = new Productionnull_25069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}