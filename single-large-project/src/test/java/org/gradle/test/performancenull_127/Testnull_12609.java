package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12609 {
    private final Productionnull_12609 production = new Productionnull_12609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}