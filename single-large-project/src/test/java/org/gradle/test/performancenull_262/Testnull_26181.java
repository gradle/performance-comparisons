package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26181 {
    private final Productionnull_26181 production = new Productionnull_26181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}