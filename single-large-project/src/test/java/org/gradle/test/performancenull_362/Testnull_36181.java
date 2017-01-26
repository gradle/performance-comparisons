package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36181 {
    private final Productionnull_36181 production = new Productionnull_36181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}