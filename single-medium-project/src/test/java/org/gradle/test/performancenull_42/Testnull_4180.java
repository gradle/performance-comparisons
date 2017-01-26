package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4180 {
    private final Productionnull_4180 production = new Productionnull_4180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}