package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5263 {
    private final Productionnull_5263 production = new Productionnull_5263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}