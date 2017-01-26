package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21919 {
    private final Productionnull_21919 production = new Productionnull_21919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}