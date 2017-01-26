package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28498 {
    private final Productionnull_28498 production = new Productionnull_28498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}