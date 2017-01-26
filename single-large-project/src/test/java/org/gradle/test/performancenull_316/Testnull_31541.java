package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31541 {
    private final Productionnull_31541 production = new Productionnull_31541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}