package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23048 {
    private final Productionnull_23048 production = new Productionnull_23048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}