package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12074 {
    private final Productionnull_12074 production = new Productionnull_12074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}