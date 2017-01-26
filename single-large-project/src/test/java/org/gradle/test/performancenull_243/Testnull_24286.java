package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24286 {
    private final Productionnull_24286 production = new Productionnull_24286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}