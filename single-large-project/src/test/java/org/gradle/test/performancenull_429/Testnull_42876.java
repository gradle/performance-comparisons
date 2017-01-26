package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42876 {
    private final Productionnull_42876 production = new Productionnull_42876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}