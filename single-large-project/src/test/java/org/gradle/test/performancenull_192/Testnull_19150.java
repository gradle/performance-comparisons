package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19150 {
    private final Productionnull_19150 production = new Productionnull_19150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}