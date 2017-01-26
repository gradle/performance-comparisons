package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42092 {
    private final Productionnull_42092 production = new Productionnull_42092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}