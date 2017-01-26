package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31966 {
    private final Productionnull_31966 production = new Productionnull_31966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}