package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7487 {
    private final Productionnull_7487 production = new Productionnull_7487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}