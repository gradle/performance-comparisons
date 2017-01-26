package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42895 {
    private final Productionnull_42895 production = new Productionnull_42895("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}