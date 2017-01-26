package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35458 {
    private final Productionnull_35458 production = new Productionnull_35458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}