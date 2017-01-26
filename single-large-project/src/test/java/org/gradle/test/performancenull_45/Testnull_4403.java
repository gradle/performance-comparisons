package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4403 {
    private final Productionnull_4403 production = new Productionnull_4403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}