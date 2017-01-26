package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28483 {
    private final Productionnull_28483 production = new Productionnull_28483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}