package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19913 {
    private final Productionnull_19913 production = new Productionnull_19913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}