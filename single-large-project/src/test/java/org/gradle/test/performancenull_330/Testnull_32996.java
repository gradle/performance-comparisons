package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32996 {
    private final Productionnull_32996 production = new Productionnull_32996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}