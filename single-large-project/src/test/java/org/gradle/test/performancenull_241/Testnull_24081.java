package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24081 {
    private final Productionnull_24081 production = new Productionnull_24081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}