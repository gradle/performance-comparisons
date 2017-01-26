package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31987 {
    private final Productionnull_31987 production = new Productionnull_31987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}