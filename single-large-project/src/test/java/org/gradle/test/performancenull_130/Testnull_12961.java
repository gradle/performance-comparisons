package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12961 {
    private final Productionnull_12961 production = new Productionnull_12961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}