package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2823 {
    private final Productionnull_2823 production = new Productionnull_2823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}