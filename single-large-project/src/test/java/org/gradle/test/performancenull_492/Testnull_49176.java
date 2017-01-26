package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49176 {
    private final Productionnull_49176 production = new Productionnull_49176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}