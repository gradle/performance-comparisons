package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10130 {
    private final Productionnull_10130 production = new Productionnull_10130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}