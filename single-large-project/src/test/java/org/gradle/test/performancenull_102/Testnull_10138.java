package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10138 {
    private final Productionnull_10138 production = new Productionnull_10138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}