package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22084 {
    private final Productionnull_22084 production = new Productionnull_22084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}