package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21585 {
    private final Productionnull_21585 production = new Productionnull_21585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}