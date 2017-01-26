package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38903 {
    private final Productionnull_38903 production = new Productionnull_38903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}