package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23965 {
    private final Productionnull_23965 production = new Productionnull_23965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}