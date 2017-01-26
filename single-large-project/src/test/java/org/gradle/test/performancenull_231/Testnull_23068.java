package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23068 {
    private final Productionnull_23068 production = new Productionnull_23068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}