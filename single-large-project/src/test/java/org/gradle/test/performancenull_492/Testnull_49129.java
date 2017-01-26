package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49129 {
    private final Productionnull_49129 production = new Productionnull_49129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}