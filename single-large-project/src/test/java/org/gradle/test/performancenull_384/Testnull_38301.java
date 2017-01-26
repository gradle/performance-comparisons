package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38301 {
    private final Productionnull_38301 production = new Productionnull_38301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}