package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42199 {
    private final Productionnull_42199 production = new Productionnull_42199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}