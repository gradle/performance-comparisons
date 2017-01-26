package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24031 {
    private final Productionnull_24031 production = new Productionnull_24031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}