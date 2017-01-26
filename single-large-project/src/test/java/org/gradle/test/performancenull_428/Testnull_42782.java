package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42782 {
    private final Productionnull_42782 production = new Productionnull_42782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}