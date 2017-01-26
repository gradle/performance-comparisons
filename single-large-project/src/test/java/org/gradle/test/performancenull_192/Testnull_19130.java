package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19130 {
    private final Productionnull_19130 production = new Productionnull_19130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}