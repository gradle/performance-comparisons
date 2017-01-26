package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24053 {
    private final Productionnull_24053 production = new Productionnull_24053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}