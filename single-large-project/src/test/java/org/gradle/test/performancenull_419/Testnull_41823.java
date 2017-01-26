package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41823 {
    private final Productionnull_41823 production = new Productionnull_41823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}