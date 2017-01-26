package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29986 {
    private final Productionnull_29986 production = new Productionnull_29986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}