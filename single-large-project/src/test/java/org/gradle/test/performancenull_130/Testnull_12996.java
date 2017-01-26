package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12996 {
    private final Productionnull_12996 production = new Productionnull_12996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}