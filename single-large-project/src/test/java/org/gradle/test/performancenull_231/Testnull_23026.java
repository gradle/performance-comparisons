package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23026 {
    private final Productionnull_23026 production = new Productionnull_23026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}