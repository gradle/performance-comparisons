package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21957 {
    private final Productionnull_21957 production = new Productionnull_21957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}