package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37279 {
    private final Productionnull_37279 production = new Productionnull_37279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}