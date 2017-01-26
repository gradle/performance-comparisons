package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28462 {
    private final Productionnull_28462 production = new Productionnull_28462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}