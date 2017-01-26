package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1912 {
    private final Productionnull_1912 production = new Productionnull_1912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}