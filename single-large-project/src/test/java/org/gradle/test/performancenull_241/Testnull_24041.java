package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24041 {
    private final Productionnull_24041 production = new Productionnull_24041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}