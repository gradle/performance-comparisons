package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34186 {
    private final Productionnull_34186 production = new Productionnull_34186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}