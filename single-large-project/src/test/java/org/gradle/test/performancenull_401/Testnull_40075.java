package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40075 {
    private final Productionnull_40075 production = new Productionnull_40075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}