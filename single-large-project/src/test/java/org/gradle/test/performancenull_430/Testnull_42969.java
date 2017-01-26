package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42969 {
    private final Productionnull_42969 production = new Productionnull_42969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}