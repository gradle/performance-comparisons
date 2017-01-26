package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40795 {
    private final Productionnull_40795 production = new Productionnull_40795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}