package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3066 {
    private final Productionnull_3066 production = new Productionnull_3066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}