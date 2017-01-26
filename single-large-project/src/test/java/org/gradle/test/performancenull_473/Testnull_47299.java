package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47299 {
    private final Productionnull_47299 production = new Productionnull_47299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}