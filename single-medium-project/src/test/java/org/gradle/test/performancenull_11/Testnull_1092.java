package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1092 {
    private final Productionnull_1092 production = new Productionnull_1092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}