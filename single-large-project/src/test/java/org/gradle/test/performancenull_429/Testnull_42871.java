package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42871 {
    private final Productionnull_42871 production = new Productionnull_42871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}