package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38942 {
    private final Productionnull_38942 production = new Productionnull_38942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}