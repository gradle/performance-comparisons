package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1795 {
    private final Productionnull_1795 production = new Productionnull_1795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}