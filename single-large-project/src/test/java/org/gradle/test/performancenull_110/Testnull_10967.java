package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10967 {
    private final Productionnull_10967 production = new Productionnull_10967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}