package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5056 {
    private final Productionnull_5056 production = new Productionnull_5056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}