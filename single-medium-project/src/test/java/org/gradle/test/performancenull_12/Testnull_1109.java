package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1109 {
    private final Productionnull_1109 production = new Productionnull_1109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}