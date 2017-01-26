package org.gradle.test.performancenull_84;

import static org.junit.Assert.*;

public class Testnull_8400 {
    private final Productionnull_8400 production = new Productionnull_8400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}