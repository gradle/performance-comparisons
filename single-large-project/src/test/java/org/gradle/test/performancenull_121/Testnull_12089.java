package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12089 {
    private final Productionnull_12089 production = new Productionnull_12089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}