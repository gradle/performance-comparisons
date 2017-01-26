package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4935 {
    private final Productionnull_4935 production = new Productionnull_4935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}