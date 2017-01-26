package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14956 {
    private final Productionnull_14956 production = new Productionnull_14956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}