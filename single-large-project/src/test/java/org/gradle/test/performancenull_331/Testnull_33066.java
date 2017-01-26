package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33066 {
    private final Productionnull_33066 production = new Productionnull_33066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}