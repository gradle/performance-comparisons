package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31958 {
    private final Productionnull_31958 production = new Productionnull_31958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}