package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21091 {
    private final Productionnull_21091 production = new Productionnull_21091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}