package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12982 {
    private final Productionnull_12982 production = new Productionnull_12982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}