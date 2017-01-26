package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40893 {
    private final Productionnull_40893 production = new Productionnull_40893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}