package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4199 {
    private final Productionnull_4199 production = new Productionnull_4199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}