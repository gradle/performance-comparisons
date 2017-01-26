package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8246 {
    private final Productionnull_8246 production = new Productionnull_8246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}