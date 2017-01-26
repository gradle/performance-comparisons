package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1858 {
    private final Productionnull_1858 production = new Productionnull_1858("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}