package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6290 {
    private final Productionnull_6290 production = new Productionnull_6290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}