package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40872 {
    private final Productionnull_40872 production = new Productionnull_40872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}