package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42958 {
    private final Productionnull_42958 production = new Productionnull_42958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}