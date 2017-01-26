package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9825 {
    private final Productionnull_9825 production = new Productionnull_9825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}