package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4002 {
    private final Productionnull_4002 production = new Productionnull_4002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}