package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8228 {
    private final Productionnull_8228 production = new Productionnull_8228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}