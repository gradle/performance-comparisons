package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28469 {
    private final Productionnull_28469 production = new Productionnull_28469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}