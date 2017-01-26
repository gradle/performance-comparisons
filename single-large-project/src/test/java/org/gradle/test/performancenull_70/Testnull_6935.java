package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6935 {
    private final Productionnull_6935 production = new Productionnull_6935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}