package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18063 {
    private final Productionnull_18063 production = new Productionnull_18063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}