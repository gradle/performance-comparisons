package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2985 {
    private final Productionnull_2985 production = new Productionnull_2985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}