package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3009 {
    private final Productionnull_3009 production = new Productionnull_3009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}