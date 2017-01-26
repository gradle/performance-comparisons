package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2798 {
    private final Productionnull_2798 production = new Productionnull_2798("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}