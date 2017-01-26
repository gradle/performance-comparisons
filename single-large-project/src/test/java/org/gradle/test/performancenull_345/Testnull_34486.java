package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34486 {
    private final Productionnull_34486 production = new Productionnull_34486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}