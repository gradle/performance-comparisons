package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17420 {
    private final Productionnull_17420 production = new Productionnull_17420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}