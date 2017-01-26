package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19925 {
    private final Productionnull_19925 production = new Productionnull_19925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}