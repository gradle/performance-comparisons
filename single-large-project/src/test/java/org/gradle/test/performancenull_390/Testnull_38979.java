package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38979 {
    private final Productionnull_38979 production = new Productionnull_38979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}