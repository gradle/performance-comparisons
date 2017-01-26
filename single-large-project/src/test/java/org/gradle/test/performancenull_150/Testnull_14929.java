package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14929 {
    private final Productionnull_14929 production = new Productionnull_14929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}