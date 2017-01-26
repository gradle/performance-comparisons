package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42055 {
    private final Productionnull_42055 production = new Productionnull_42055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}