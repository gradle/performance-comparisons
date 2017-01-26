package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11082 {
    private final Productionnull_11082 production = new Productionnull_11082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}