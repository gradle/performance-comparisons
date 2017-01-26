package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12986 {
    private final Productionnull_12986 production = new Productionnull_12986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}