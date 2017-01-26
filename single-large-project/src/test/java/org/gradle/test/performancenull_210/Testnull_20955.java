package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20955 {
    private final Productionnull_20955 production = new Productionnull_20955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}