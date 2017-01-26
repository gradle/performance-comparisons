package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23007 {
    private final Productionnull_23007 production = new Productionnull_23007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}