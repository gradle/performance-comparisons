package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32441 {
    private final Productionnull_32441 production = new Productionnull_32441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}