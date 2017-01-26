package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7989 {
    private final Productionnull_7989 production = new Productionnull_7989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}