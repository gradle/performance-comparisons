package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20215 {
    private final Productionnull_20215 production = new Productionnull_20215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}