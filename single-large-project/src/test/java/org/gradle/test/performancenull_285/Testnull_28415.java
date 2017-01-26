package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28415 {
    private final Productionnull_28415 production = new Productionnull_28415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}