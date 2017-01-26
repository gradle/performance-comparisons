package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18075 {
    private final Productionnull_18075 production = new Productionnull_18075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}