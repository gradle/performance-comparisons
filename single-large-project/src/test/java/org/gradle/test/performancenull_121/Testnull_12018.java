package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12018 {
    private final Productionnull_12018 production = new Productionnull_12018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}