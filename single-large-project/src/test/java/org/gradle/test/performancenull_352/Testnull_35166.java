package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35166 {
    private final Productionnull_35166 production = new Productionnull_35166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}