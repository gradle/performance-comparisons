package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42821 {
    private final Productionnull_42821 production = new Productionnull_42821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}