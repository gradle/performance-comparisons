package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42193 {
    private final Productionnull_42193 production = new Productionnull_42193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}