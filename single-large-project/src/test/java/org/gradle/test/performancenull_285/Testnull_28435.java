package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28435 {
    private final Productionnull_28435 production = new Productionnull_28435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}