package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17421 {
    private final Productionnull_17421 production = new Productionnull_17421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}