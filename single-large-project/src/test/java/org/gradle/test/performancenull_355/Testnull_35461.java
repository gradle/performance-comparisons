package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35461 {
    private final Productionnull_35461 production = new Productionnull_35461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}