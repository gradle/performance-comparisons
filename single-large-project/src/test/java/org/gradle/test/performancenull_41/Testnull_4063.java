package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4063 {
    private final Productionnull_4063 production = new Productionnull_4063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}