package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19908 {
    private final Productionnull_19908 production = new Productionnull_19908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}