package org.gradle.test.performancenull_152;

import static org.junit.Assert.*;

public class Testnull_15183 {
    private final Productionnull_15183 production = new Productionnull_15183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}