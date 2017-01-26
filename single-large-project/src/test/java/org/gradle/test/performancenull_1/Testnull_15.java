package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_15 {
    private final Productionnull_15 production = new Productionnull_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}