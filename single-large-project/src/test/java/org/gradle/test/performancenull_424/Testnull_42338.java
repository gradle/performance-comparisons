package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42338 {
    private final Productionnull_42338 production = new Productionnull_42338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}