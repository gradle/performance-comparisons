package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24923 {
    private final Productionnull_24923 production = new Productionnull_24923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}