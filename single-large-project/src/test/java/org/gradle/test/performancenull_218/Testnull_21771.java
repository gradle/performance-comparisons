package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21771 {
    private final Productionnull_21771 production = new Productionnull_21771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}