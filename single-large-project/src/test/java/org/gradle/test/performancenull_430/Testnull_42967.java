package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42967 {
    private final Productionnull_42967 production = new Productionnull_42967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}