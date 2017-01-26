package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30159 {
    private final Productionnull_30159 production = new Productionnull_30159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}