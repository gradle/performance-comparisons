package org.gradle.test.performancenull_108;

import static org.junit.Assert.*;

public class Testnull_10789 {
    private final Productionnull_10789 production = new Productionnull_10789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}