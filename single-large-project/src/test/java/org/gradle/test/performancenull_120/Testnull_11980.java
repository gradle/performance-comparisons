package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11980 {
    private final Productionnull_11980 production = new Productionnull_11980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}