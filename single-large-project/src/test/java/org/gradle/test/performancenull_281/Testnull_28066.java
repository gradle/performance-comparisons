package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28066 {
    private final Productionnull_28066 production = new Productionnull_28066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}