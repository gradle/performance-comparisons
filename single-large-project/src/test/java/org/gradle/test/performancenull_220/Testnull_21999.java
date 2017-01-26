package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21999 {
    private final Productionnull_21999 production = new Productionnull_21999("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}