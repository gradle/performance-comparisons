package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14946 {
    private final Productionnull_14946 production = new Productionnull_14946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}