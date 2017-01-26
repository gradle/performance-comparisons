package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32974 {
    private final Productionnull_32974 production = new Productionnull_32974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}