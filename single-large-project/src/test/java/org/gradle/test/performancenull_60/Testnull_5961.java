package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5961 {
    private final Productionnull_5961 production = new Productionnull_5961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}