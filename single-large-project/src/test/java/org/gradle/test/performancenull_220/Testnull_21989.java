package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21989 {
    private final Productionnull_21989 production = new Productionnull_21989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}