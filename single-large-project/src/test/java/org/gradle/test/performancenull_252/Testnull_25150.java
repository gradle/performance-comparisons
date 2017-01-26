package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25150 {
    private final Productionnull_25150 production = new Productionnull_25150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}