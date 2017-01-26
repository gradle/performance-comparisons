package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18645 {
    private final Productionnull_18645 production = new Productionnull_18645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}