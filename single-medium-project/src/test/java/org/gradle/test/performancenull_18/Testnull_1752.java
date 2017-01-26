package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1752 {
    private final Productionnull_1752 production = new Productionnull_1752("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}