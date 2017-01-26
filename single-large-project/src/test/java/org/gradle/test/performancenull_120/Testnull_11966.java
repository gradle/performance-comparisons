package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11966 {
    private final Productionnull_11966 production = new Productionnull_11966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}