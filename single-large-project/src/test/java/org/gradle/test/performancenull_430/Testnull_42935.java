package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42935 {
    private final Productionnull_42935 production = new Productionnull_42935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}