package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42878 {
    private final Productionnull_42878 production = new Productionnull_42878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}