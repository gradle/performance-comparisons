package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15926 {
    private final Productionnull_15926 production = new Productionnull_15926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}