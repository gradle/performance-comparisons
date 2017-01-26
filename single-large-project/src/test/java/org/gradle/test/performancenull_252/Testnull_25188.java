package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25188 {
    private final Productionnull_25188 production = new Productionnull_25188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}