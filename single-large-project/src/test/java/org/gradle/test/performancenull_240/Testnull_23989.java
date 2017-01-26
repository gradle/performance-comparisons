package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23989 {
    private final Productionnull_23989 production = new Productionnull_23989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}