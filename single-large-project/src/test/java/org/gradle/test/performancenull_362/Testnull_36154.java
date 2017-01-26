package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36154 {
    private final Productionnull_36154 production = new Productionnull_36154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}