package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34426 {
    private final Productionnull_34426 production = new Productionnull_34426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}