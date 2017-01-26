package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1250 {
    private final Productionnull_1250 production = new Productionnull_1250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}