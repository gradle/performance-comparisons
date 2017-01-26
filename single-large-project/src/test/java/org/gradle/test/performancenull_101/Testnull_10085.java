package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10085 {
    private final Productionnull_10085 production = new Productionnull_10085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}