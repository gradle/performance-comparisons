package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46026 {
    private final Productionnull_46026 production = new Productionnull_46026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}