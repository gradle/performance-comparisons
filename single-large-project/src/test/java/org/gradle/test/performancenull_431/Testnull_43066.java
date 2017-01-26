package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43066 {
    private final Productionnull_43066 production = new Productionnull_43066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}