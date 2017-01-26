package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37442 {
    private final Productionnull_37442 production = new Productionnull_37442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}