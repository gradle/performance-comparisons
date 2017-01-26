package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21437 {
    private final Productionnull_21437 production = new Productionnull_21437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}