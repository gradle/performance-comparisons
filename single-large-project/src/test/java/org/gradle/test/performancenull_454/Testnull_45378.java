package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45378 {
    private final Productionnull_45378 production = new Productionnull_45378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}