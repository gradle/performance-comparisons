package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42830 {
    private final Productionnull_42830 production = new Productionnull_42830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}