package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19927 {
    private final Productionnull_19927 production = new Productionnull_19927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}