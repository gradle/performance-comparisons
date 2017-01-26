package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40276 {
    private final Productionnull_40276 production = new Productionnull_40276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}