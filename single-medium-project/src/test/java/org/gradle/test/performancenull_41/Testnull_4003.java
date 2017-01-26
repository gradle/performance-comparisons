package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4003 {
    private final Productionnull_4003 production = new Productionnull_4003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}