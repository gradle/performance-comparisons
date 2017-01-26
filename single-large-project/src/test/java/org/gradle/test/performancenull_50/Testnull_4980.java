package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4980 {
    private final Productionnull_4980 production = new Productionnull_4980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}