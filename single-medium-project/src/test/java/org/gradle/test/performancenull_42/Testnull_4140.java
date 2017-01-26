package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4140 {
    private final Productionnull_4140 production = new Productionnull_4140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}