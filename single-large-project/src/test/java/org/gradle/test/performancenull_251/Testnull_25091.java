package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25091 {
    private final Productionnull_25091 production = new Productionnull_25091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}