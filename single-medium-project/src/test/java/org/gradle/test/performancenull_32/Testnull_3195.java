package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3195 {
    private final Productionnull_3195 production = new Productionnull_3195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}