package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21930 {
    private final Productionnull_21930 production = new Productionnull_21930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}