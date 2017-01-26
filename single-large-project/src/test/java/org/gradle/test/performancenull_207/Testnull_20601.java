package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20601 {
    private final Productionnull_20601 production = new Productionnull_20601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}