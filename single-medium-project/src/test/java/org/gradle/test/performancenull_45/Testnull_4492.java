package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4492 {
    private final Productionnull_4492 production = new Productionnull_4492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}