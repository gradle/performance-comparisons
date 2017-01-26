package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37156 {
    private final Productionnull_37156 production = new Productionnull_37156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}