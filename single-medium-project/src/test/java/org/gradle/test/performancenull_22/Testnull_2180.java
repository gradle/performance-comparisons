package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2180 {
    private final Productionnull_2180 production = new Productionnull_2180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}