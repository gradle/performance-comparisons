package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18748 {
    private final Productionnull_18748 production = new Productionnull_18748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}