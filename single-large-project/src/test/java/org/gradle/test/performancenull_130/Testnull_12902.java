package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12902 {
    private final Productionnull_12902 production = new Productionnull_12902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}