package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42097 {
    private final Productionnull_42097 production = new Productionnull_42097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}