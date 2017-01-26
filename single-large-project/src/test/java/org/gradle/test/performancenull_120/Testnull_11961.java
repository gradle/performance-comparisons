package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11961 {
    private final Productionnull_11961 production = new Productionnull_11961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}