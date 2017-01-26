package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37199 {
    private final Productionnull_37199 production = new Productionnull_37199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}