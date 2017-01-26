package org.gradle.test.performancenull_227;

import static org.junit.Assert.*;

public class Testnull_22668 {
    private final Productionnull_22668 production = new Productionnull_22668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}