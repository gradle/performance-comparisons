package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42955 {
    private final Productionnull_42955 production = new Productionnull_42955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}