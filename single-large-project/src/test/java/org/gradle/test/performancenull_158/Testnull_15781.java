package org.gradle.test.performancenull_158;

import static org.junit.Assert.*;

public class Testnull_15781 {
    private final Productionnull_15781 production = new Productionnull_15781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}