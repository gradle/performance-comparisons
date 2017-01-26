package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6169 {
    private final Productionnull_6169 production = new Productionnull_6169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}