package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21996 {
    private final Productionnull_21996 production = new Productionnull_21996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}