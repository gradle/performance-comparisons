package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4110 {
    private final Productionnull_4110 production = new Productionnull_4110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}