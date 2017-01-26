package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12876 {
    private final Productionnull_12876 production = new Productionnull_12876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}