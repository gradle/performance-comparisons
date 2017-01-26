package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2908 {
    private final Productionnull_2908 production = new Productionnull_2908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}