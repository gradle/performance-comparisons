package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12091 {
    private final Productionnull_12091 production = new Productionnull_12091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}