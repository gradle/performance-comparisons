package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5912 {
    private final Productionnull_5912 production = new Productionnull_5912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}