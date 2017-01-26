package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18065 {
    private final Productionnull_18065 production = new Productionnull_18065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}