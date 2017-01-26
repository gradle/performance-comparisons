package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21203 {
    private final Productionnull_21203 production = new Productionnull_21203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}