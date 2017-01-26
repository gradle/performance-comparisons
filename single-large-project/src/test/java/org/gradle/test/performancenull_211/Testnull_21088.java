package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21088 {
    private final Productionnull_21088 production = new Productionnull_21088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}