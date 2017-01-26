package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18398 {
    private final Productionnull_18398 production = new Productionnull_18398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}