package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12099 {
    private final Productionnull_12099 production = new Productionnull_12099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}