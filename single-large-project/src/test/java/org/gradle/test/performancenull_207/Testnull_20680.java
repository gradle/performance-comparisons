package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20680 {
    private final Productionnull_20680 production = new Productionnull_20680("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}