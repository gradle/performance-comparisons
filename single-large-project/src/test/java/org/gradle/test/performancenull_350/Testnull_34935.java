package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34935 {
    private final Productionnull_34935 production = new Productionnull_34935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}