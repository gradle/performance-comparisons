package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9098 {
    private final Productionnull_9098 production = new Productionnull_9098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}