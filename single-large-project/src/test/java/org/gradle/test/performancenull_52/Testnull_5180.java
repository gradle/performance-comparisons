package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5180 {
    private final Productionnull_5180 production = new Productionnull_5180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}