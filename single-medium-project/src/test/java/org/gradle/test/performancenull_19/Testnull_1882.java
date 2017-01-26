package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1882 {
    private final Productionnull_1882 production = new Productionnull_1882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}