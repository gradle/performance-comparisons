package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38486 {
    private final Productionnull_38486 production = new Productionnull_38486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}