package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35409 {
    private final Productionnull_35409 production = new Productionnull_35409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}