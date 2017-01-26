package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24062 {
    private final Productionnull_24062 production = new Productionnull_24062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}