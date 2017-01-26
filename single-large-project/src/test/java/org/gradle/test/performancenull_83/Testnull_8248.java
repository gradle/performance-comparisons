package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8248 {
    private final Productionnull_8248 production = new Productionnull_8248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}