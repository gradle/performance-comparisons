package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10196 {
    private final Productionnull_10196 production = new Productionnull_10196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}