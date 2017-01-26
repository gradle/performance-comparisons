package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1548 {
    private final Productionnull_1548 production = new Productionnull_1548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}