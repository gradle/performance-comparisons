package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26972 {
    private final Productionnull_26972 production = new Productionnull_26972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}