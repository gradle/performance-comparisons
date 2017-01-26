package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3065 {
    private final Productionnull_3065 production = new Productionnull_3065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}