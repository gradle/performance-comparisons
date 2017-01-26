package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7998 {
    private final Productionnull_7998 production = new Productionnull_7998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}