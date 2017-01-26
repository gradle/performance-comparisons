package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24951 {
    private final Productionnull_24951 production = new Productionnull_24951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}