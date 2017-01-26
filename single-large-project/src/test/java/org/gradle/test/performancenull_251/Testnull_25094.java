package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25094 {
    private final Productionnull_25094 production = new Productionnull_25094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}