package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_129 {
    private final Productionnull_129 production = new Productionnull_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}