package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1575 {
    private final Productionnull_1575 production = new Productionnull_1575("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}