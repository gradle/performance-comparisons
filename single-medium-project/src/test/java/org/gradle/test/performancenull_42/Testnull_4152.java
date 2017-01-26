package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4152 {
    private final Productionnull_4152 production = new Productionnull_4152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}