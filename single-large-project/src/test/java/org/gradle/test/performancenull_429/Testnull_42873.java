package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42873 {
    private final Productionnull_42873 production = new Productionnull_42873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}