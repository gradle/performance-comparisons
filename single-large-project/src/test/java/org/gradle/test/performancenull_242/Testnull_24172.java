package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24172 {
    private final Productionnull_24172 production = new Productionnull_24172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}