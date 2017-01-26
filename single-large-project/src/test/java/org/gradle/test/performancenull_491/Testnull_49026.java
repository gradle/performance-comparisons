package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49026 {
    private final Productionnull_49026 production = new Productionnull_49026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}