package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30299 {
    private final Productionnull_30299 production = new Productionnull_30299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}