package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36908 {
    private final Productionnull_36908 production = new Productionnull_36908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}