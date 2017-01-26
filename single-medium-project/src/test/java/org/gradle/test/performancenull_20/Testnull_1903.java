package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1903 {
    private final Productionnull_1903 production = new Productionnull_1903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}