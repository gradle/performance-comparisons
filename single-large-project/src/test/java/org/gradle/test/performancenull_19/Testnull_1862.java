package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1862 {
    private final Productionnull_1862 production = new Productionnull_1862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}