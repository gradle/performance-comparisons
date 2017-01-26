package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6942 {
    private final Productionnull_6942 production = new Productionnull_6942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}