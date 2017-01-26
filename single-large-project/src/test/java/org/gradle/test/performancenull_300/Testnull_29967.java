package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29967 {
    private final Productionnull_29967 production = new Productionnull_29967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}