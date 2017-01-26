package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2902 {
    private final Productionnull_2902 production = new Productionnull_2902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}