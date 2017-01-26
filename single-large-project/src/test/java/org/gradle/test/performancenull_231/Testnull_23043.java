package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23043 {
    private final Productionnull_23043 production = new Productionnull_23043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}