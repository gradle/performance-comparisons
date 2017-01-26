package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23506 {
    private final Productionnull_23506 production = new Productionnull_23506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}