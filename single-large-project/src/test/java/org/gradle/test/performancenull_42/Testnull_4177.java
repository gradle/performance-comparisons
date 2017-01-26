package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4177 {
    private final Productionnull_4177 production = new Productionnull_4177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}