package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1902 {
    private final Productionnull_1902 production = new Productionnull_1902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}