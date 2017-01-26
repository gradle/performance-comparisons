package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4119 {
    private final Productionnull_4119 production = new Productionnull_4119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}