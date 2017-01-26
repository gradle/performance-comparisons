package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19935 {
    private final Productionnull_19935 production = new Productionnull_19935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}