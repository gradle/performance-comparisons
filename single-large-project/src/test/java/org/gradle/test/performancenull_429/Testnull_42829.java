package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42829 {
    private final Productionnull_42829 production = new Productionnull_42829("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}