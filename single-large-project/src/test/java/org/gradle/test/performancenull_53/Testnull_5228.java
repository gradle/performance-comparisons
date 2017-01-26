package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5228 {
    private final Productionnull_5228 production = new Productionnull_5228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}