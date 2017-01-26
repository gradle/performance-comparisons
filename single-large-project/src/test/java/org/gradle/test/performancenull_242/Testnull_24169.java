package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24169 {
    private final Productionnull_24169 production = new Productionnull_24169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}