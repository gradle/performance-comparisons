package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32500 {
    private final Productionnull_32500 production = new Productionnull_32500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}