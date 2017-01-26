package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7930 {
    private final Productionnull_7930 production = new Productionnull_7930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}