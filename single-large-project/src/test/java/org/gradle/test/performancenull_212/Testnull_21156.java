package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21156 {
    private final Productionnull_21156 production = new Productionnull_21156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}