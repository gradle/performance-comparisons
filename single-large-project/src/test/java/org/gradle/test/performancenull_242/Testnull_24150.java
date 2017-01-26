package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24150 {
    private final Productionnull_24150 production = new Productionnull_24150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}