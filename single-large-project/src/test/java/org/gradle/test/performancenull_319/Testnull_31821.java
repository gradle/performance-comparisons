package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31821 {
    private final Productionnull_31821 production = new Productionnull_31821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}