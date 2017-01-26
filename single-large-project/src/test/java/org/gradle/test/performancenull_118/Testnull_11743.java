package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11743 {
    private final Productionnull_11743 production = new Productionnull_11743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}