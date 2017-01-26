package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4153 {
    private final Productionnull_4153 production = new Productionnull_4153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}