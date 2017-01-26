package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_42 {
    private final Productionnull_42 production = new Productionnull_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}