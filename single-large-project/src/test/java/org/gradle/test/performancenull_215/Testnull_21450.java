package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21450 {
    private final Productionnull_21450 production = new Productionnull_21450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}