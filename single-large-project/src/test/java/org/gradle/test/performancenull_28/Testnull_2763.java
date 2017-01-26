package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2763 {
    private final Productionnull_2763 production = new Productionnull_2763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}