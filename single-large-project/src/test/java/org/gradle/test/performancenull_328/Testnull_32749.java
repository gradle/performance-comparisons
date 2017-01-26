package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32749 {
    private final Productionnull_32749 production = new Productionnull_32749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}