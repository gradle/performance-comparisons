package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4463 {
    private final Productionnull_4463 production = new Productionnull_4463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}