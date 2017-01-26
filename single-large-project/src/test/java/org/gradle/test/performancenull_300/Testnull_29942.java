package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29942 {
    private final Productionnull_29942 production = new Productionnull_29942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}