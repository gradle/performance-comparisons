package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42745 {
    private final Productionnull_42745 production = new Productionnull_42745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}