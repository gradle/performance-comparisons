package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42398 {
    private final Productionnull_42398 production = new Productionnull_42398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}