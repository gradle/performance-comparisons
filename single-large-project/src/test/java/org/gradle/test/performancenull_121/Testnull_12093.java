package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12093 {
    private final Productionnull_12093 production = new Productionnull_12093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}