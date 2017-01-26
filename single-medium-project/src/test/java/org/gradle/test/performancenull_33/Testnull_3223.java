package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3223 {
    private final Productionnull_3223 production = new Productionnull_3223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}