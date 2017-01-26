package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2011 {
    private final Productionnull_2011 production = new Productionnull_2011("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}