package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25146 {
    private final Productionnull_25146 production = new Productionnull_25146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}