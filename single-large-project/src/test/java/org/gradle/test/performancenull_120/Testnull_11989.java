package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11989 {
    private final Productionnull_11989 production = new Productionnull_11989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}