package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4193 {
    private final Productionnull_4193 production = new Productionnull_4193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}