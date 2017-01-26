package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5288 {
    private final Productionnull_5288 production = new Productionnull_5288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}