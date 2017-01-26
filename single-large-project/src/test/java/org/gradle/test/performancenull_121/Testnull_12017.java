package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12017 {
    private final Productionnull_12017 production = new Productionnull_12017("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}