package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24076 {
    private final Productionnull_24076 production = new Productionnull_24076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}