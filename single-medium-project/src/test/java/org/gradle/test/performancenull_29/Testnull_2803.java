package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2803 {
    private final Productionnull_2803 production = new Productionnull_2803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}