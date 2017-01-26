package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20155 {
    private final Productionnull_20155 production = new Productionnull_20155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}