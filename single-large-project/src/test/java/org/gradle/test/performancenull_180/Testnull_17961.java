package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17961 {
    private final Productionnull_17961 production = new Productionnull_17961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}