package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36264 {
    private final Productionnull_36264 production = new Productionnull_36264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}