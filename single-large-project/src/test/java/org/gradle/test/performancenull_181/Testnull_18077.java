package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18077 {
    private final Productionnull_18077 production = new Productionnull_18077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}