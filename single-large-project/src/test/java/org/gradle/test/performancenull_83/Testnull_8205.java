package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8205 {
    private final Productionnull_8205 production = new Productionnull_8205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}