package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11823 {
    private final Productionnull_11823 production = new Productionnull_11823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}