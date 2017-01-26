package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1063 {
    private final Productionnull_1063 production = new Productionnull_1063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}