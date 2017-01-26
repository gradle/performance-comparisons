package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34003 {
    private final Productionnull_34003 production = new Productionnull_34003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}