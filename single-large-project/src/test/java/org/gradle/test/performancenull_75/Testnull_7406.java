package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7406 {
    private final Productionnull_7406 production = new Productionnull_7406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}