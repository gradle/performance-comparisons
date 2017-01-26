package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7937 {
    private final Productionnull_7937 production = new Productionnull_7937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}