package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6902 {
    private final Productionnull_6902 production = new Productionnull_6902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}