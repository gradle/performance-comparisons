package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21908 {
    private final Productionnull_21908 production = new Productionnull_21908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}