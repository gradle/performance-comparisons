package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5989 {
    private final Productionnull_5989 production = new Productionnull_5989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}