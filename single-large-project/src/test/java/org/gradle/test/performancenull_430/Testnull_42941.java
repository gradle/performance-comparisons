package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42941 {
    private final Productionnull_42941 production = new Productionnull_42941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}