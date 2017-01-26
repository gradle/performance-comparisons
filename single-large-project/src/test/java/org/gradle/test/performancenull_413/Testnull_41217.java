package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41217 {
    private final Productionnull_41217 production = new Productionnull_41217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}