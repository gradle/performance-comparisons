package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40045 {
    private final Productionnull_40045 production = new Productionnull_40045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}