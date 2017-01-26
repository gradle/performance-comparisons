package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36286 {
    private final Productionnull_36286 production = new Productionnull_36286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}