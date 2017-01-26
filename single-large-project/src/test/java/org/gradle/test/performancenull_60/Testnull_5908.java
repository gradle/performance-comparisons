package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5908 {
    private final Productionnull_5908 production = new Productionnull_5908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}