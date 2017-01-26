package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21494 {
    private final Productionnull_21494 production = new Productionnull_21494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}