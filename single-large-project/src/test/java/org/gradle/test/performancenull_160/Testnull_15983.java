package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15983 {
    private final Productionnull_15983 production = new Productionnull_15983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}