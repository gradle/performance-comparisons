package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25821 {
    private final Productionnull_25821 production = new Productionnull_25821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}