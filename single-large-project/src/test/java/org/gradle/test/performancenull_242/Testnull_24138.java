package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24138 {
    private final Productionnull_24138 production = new Productionnull_24138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}