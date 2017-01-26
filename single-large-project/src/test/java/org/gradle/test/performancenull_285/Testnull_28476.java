package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28476 {
    private final Productionnull_28476 production = new Productionnull_28476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}