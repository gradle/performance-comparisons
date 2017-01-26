package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37881 {
    private final Productionnull_37881 production = new Productionnull_37881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}