package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49195 {
    private final Productionnull_49195 production = new Productionnull_49195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}