package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28403 {
    private final Productionnull_28403 production = new Productionnull_28403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}