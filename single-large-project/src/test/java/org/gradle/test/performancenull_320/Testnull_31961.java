package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31961 {
    private final Productionnull_31961 production = new Productionnull_31961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}