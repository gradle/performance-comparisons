package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23382 {
    private final Productionnull_23382 production = new Productionnull_23382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}