package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5986 {
    private final Productionnull_5986 production = new Productionnull_5986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}