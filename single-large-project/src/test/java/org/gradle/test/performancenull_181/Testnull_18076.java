package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18076 {
    private final Productionnull_18076 production = new Productionnull_18076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}