package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18461 {
    private final Productionnull_18461 production = new Productionnull_18461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}