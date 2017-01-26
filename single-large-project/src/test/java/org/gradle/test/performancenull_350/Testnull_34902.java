package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34902 {
    private final Productionnull_34902 production = new Productionnull_34902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}