package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31433 {
    private final Productionnull_31433 production = new Productionnull_31433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}