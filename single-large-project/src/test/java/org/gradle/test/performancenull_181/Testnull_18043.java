package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18043 {
    private final Productionnull_18043 production = new Productionnull_18043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}