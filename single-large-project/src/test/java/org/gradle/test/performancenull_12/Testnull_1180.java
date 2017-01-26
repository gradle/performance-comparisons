package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1180 {
    private final Productionnull_1180 production = new Productionnull_1180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}