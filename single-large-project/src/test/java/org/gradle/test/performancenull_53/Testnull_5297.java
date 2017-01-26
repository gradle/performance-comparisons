package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5297 {
    private final Productionnull_5297 production = new Productionnull_5297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}