package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21059 {
    private final Productionnull_21059 production = new Productionnull_21059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}