package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28430 {
    private final Productionnull_28430 production = new Productionnull_28430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}