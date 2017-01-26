package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21268 {
    private final Productionnull_21268 production = new Productionnull_21268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}