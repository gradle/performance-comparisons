package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4431 {
    private final Productionnull_4431 production = new Productionnull_4431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}