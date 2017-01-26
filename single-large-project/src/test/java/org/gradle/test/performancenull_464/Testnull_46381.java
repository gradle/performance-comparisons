package org.gradle.test.performancenull_464;

import static org.junit.Assert.*;

public class Testnull_46381 {
    private final Productionnull_46381 production = new Productionnull_46381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}