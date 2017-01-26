package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_935 {
    private final Productionnull_935 production = new Productionnull_935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}