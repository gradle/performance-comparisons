package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2187 {
    private final Productionnull_2187 production = new Productionnull_2187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}