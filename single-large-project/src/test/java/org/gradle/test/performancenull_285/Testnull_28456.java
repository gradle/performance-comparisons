package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28456 {
    private final Productionnull_28456 production = new Productionnull_28456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}