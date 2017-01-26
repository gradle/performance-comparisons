package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28480 {
    private final Productionnull_28480 production = new Productionnull_28480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}