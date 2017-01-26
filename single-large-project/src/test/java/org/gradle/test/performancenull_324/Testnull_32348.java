package org.gradle.test.performancenull_324;

import static org.junit.Assert.*;

public class Testnull_32348 {
    private final Productionnull_32348 production = new Productionnull_32348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}