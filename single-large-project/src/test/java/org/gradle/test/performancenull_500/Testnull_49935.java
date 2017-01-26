package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49935 {
    private final Productionnull_49935 production = new Productionnull_49935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}