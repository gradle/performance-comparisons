package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7971 {
    private final Productionnull_7971 production = new Productionnull_7971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}