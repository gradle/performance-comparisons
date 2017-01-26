package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22972 {
    private final Productionnull_22972 production = new Productionnull_22972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}