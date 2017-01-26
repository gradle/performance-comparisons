package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49228 {
    private final Productionnull_49228 production = new Productionnull_49228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}