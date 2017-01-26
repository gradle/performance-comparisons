package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21541 {
    private final Productionnull_21541 production = new Productionnull_21541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}