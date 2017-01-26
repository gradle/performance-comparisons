package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4795 {
    private final Productionnull_4795 production = new Productionnull_4795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}