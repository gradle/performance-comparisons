package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2008 {
    private final Productionnull_2008 production = new Productionnull_2008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}