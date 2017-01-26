package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4490 {
    private final Productionnull_4490 production = new Productionnull_4490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}