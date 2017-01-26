package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4065 {
    private final Productionnull_4065 production = new Productionnull_4065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}