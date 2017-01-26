package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11062 {
    private final Productionnull_11062 production = new Productionnull_11062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}