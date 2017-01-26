package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38435 {
    private final Productionnull_38435 production = new Productionnull_38435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}