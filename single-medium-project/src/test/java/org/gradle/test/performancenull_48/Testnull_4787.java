package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4787 {
    private final Productionnull_4787 production = new Productionnull_4787("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}