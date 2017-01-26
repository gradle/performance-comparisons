package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5957 {
    private final Productionnull_5957 production = new Productionnull_5957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}