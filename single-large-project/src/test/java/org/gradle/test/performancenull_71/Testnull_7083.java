package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7083 {
    private final Productionnull_7083 production = new Productionnull_7083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}