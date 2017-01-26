package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3506 {
    private final Productionnull_3506 production = new Productionnull_3506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}