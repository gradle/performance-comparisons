package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3149 {
    private final Productionnull_3149 production = new Productionnull_3149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}