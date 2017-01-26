package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39956 {
    private final Productionnull_39956 production = new Productionnull_39956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}