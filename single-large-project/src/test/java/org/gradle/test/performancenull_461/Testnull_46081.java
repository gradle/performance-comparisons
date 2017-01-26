package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46081 {
    private final Productionnull_46081 production = new Productionnull_46081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}