package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35265 {
    private final Productionnull_35265 production = new Productionnull_35265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}