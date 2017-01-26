package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37104 {
    private final Productionnull_37104 production = new Productionnull_37104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}