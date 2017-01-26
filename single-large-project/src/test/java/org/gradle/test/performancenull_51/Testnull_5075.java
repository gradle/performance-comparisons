package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5075 {
    private final Productionnull_5075 production = new Productionnull_5075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}