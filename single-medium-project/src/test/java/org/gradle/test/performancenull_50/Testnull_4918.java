package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4918 {
    private final Productionnull_4918 production = new Productionnull_4918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}