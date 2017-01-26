package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37248 {
    private final Productionnull_37248 production = new Productionnull_37248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}