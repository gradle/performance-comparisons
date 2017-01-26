package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7942 {
    private final Productionnull_7942 production = new Productionnull_7942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}