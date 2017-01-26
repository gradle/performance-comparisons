package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49948 {
    private final Productionnull_49948 production = new Productionnull_49948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}