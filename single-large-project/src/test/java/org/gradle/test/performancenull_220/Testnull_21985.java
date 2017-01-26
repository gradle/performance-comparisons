package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21985 {
    private final Productionnull_21985 production = new Productionnull_21985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}